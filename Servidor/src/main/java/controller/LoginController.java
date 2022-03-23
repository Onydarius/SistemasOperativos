package controller;

import view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.LoginModel;

public class LoginController implements ActionListener {

    private LoginView view;
    private LoginModel model;

    public LoginController(LoginView loginView, LoginModel loginModel) {
        this.view = loginView;
        this.model = loginModel;
        this.view.getConnect_button().addActionListener(this);
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String serverName = view.getName_txt().getText();
        int port = Integer.parseInt(view.getPort_txt().getText());

        if (model.createServer(serverName, port)) {
            view.dispose();
        } else {

            JOptionPane optionPane = new JOptionPane("No se ha podido crear el servidor", JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error!");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

        }
    }

}
