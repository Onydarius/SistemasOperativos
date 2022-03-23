package model;

import entity.MessageEntity;
import entity.userEntity;
import view.ServerView;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerModel extends Thread {

    int port;
    ServerView view;
    ServerSocket server;
    Socket sc;
    ObjectInputStream in;
    ObjectOutputStream out;
    HashMap<String, userEntity> online;

    public ServerModel(int port, ServerView view) {
        super();
        this.online = new HashMap<String, userEntity>();
        this.port = port;
        this.view = view;
    }

    public void run() {
        openServer();
    }

    public void openServer() {
        try {
            server = new ServerSocket(port);

            while (true) {
                sc = server.accept();
                in = new ObjectInputStream(sc.getInputStream());
                MessageEntity message = (MessageEntity) in.readObject();

                isCommand(message);

                in.close();
                sc.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendAll(MessageEntity message) throws IOException {
        Iterator it = online.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            String key = message.getIp() + ":" + message.getPort();
            try {
                if (!pair.getKey().toString().equals(key)) {
                    userEntity aux = (userEntity) pair.getValue();
                    Socket response = new Socket(aux.getIp(), aux.getPort());
                    ObjectOutputStream out = new ObjectOutputStream(response.getOutputStream());
                    out.writeObject(message);
                    out.close();
                    response.close();
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    private void sendSigle(MessageEntity message) throws IOException {
        try {
            Socket response = new Socket(message.getIp(), message.getPort());
            ObjectOutputStream out = new ObjectOutputStream(response.getOutputStream());
            out.writeObject(message);
            out.close();
            response.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public void stopServer() throws IOException {
        server.close();
        this.stop();
    }

    private void isCommand(MessageEntity message) throws IOException {
        String aux = message.getText();
        switch (aux) {
            case "@login" ->
                login(message);
            case "@logout" ->
                logout(message);
            default -> {
                view.getLog().append(message.getUser() + ": " + message.getText() + "\n");
                sendAll(message);
            }
        }
    }

    public void login(MessageEntity message) throws IOException {
        int auxPort = message.getPort();
        String auxUser = message.getUser();
        String auxIp = message.getIp();
        String cad = auxUser + " se ha unido al chat con la ip  " + auxIp + " con el puerto " + auxPort + "\n";
        userEntity aux = new userEntity(auxUser, auxIp, auxPort);
        online.put(auxIp + ":" + auxPort, aux);
        view.getLog().append(auxUser + " se ha unido al chat con la ip  " + auxIp + " con el puerto " + auxPort + "\n");
        sendAll(new MessageEntity("@Server_login", "se ha unido al chat", auxIp, auxPort));
        sendSigle(new MessageEntity("@login", view.getServerName_label().getText(), auxIp, auxPort));
        view.getListModel().addElement(auxUser);
    }

    private void logout(MessageEntity message) throws IOException {
        String key = message.getIp() + ":" + message.getPort();
        String cad = message.getUser() + " se ha desconectado." + "\n";
        userEntity aux = online.get(key);
        online.remove(key);
        view.getListModel().removeElement(aux.getUser());
        view.getLog().append(cad);
        sendAll(new MessageEntity("@Server_logout", cad, message.getIp(), message.getPort()));
    }
}
