package model;

import entity.MessageEntity;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import view.ClientView;

/**
 *
 * @author Onyda
 */
public class ClientModel extends Thread {

    Socket sc;
    ClientView view;
    ObjectInputStream in;
    ObjectOutputStream out;
    int port;
    int listenPort;

    ClientModel(int port, ClientView view) {
        this.view = view;
        this.port = port;
    }

    public void login(MessageEntity message) {
        try {
            sendMessage(message);
        } catch (Exception e) {
            return;
        }
    }

    public void sendMessage(MessageEntity message) {
        try {
            Socket sc = new Socket("192.168.1.61", port);
            out = new ObjectOutputStream(sc.getOutputStream());
            out.writeObject(message);
            sc.close();

        } catch (IOException ex) {
            System.out.println(ex);
            return;
        }
        return;
    }

    public void closeConection(MessageEntity message) {
        sendMessage(message);
    }

    @Override
    public void run() {
        try {
            ServerSocket sd = new ServerSocket(listenPort);
            Socket client;
            while (true) {
                client = sd.accept();
                ObjectInputStream entrada = new ObjectInputStream(client.getInputStream());
                MessageEntity message = (MessageEntity) entrada.readObject();
                
                switch (message.getUser()) {
                    case "@login":
                        view.getServerName_label().setText(message.getText().trim());
                        break;
                    case "@Server_login":
                        view.getListModel().addElement(getUser(message.getText()));
                        addAnouncement(message.getText());
                        break;
                    case "@Server_logout":
                        view.getListModel().removeElement(getUser(message.getText()));
                        addAnouncement(message.getText());
                        break;
                    default:
                        addMessage(message);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void addMessage(MessageEntity message) {
        view.getLog().append(message.getUser() + ": " + message.getText() + "\n");
    }

    private void addAnouncement(String msg) {
        view.getLog().append("@Servidor: " + msg + "\n");
    }
    private String getUser(String cad){
        String[] vector = cad.split(" ");
        return vector[0];
    }

    public void setListenPort(int listenPort) {
        this.listenPort = listenPort;
    }
}
