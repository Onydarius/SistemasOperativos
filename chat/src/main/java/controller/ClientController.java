package controller;

import entity.MessageEntity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.ServerSocket;
import model.ClientModel;
import view.ClientView;

public class ClientController implements ActionListener, WindowListener {

    ClientModel model;
    ClientView view;
    String user;
    String ip;
    
    int port;

    public ClientController(ClientModel clientModel, ClientView clientView, String user, String ip) {
        try {
            ServerSocket auxiliar = new ServerSocket(0);
            this.model = clientModel;
            this.view = clientView;
            this.user = user;
            this.ip = ip;
            this.port = auxiliar.getLocalPort();
            auxiliar.close();
            init();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

    }

    private void init() {
        try {
            model.login(new MessageEntity(user, "@login", ip, port));
            view.setTitle("Cliente " + this.port);
            view.getUser_label().setText(user);
            view.addWindowListener(this);
            view.setLocationRelativeTo(null);
            view.setVisible(true);
            view.getSend_button().addActionListener(this);
            model.setListenPort(port);
            model.start();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = view.getMessage_txt().getText();
        model.sendMessage(new MessageEntity(user, msg, ip, port));
        view.getMessage_txt().setText("");
        view.getLog().append(user + ": " + msg + "\n");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        model.closeConection(new MessageEntity(user, "@logout", ip, port));
        model.stop();
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}
