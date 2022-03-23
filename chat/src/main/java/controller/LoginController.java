package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.LoginModel;
import view.LoginView;

public class LoginController implements ActionListener {

    LoginModel model;
    LoginView view;

    public LoginController(LoginModel loginModel, LoginView loginView) {
        this.model = loginModel;
        this.view = loginView;
        init();
    }

    private void init() {
        view.getConnect_button().addActionListener(this);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int port = 0;
        String user = view.getUser_txt().getText();
        String ip = view.getIp_txt().getText();
        
        try {

            port = Integer.parseInt(view.getPort_txt().getText());
        } catch (NumberFormatException num) {
        } finally {
            if (user.isEmpty()) {
                alert("Introduce un usuario valido.");
                return;
            }
            if (ip.isEmpty()) {
                alert("Introduce una ip valida.");
                return;
            }
            if (!model.connectServer(user, ip, port)) {
                alert("No se ha podido encontrar el servidor.");
                return;
            }
            view.dispose();
        }

    }

    private void alert(String msg) {
        JOptionPane optionPane = new JOptionPane(msg, JOptionPane.WARNING_MESSAGE);
        JDialog dialog = optionPane.createDialog("Error!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

}
