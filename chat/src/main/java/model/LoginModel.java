package model;

import controller.ClientController;
import view.ClientView;

public class LoginModel {

    public boolean connectServer(String user,String ip, int port) {
        try {
            ClientView clientView = new ClientView();
            ClientModel clientModel = new ClientModel(port, clientView);
            ClientController clientController = new ClientController(clientModel, clientView, user, ip);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;

    }

}
