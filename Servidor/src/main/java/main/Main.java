package main;

import controller.LoginController;
import view.LoginView;
import model.LoginModel;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel();
        LoginController loginController = new LoginController(loginView, loginModel);
        loginView.setVisible(true);
    }
}
    