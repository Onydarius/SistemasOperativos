package model;

import controller.ServerController;
import view.ServerView;

public class LoginModel {

    public void createServer() {

    }

    public boolean createServer(String serverName, int port) {
        try {
            ServerView serverView = new ServerView();
            ServerController serverController = new ServerController(serverView, serverName, port);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        
    }

}
