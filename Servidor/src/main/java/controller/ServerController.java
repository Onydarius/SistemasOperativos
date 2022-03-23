package controller;

import view.ServerView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import model.ServerModel;

/**
 *
 * @author Onyda
 */
public class ServerController implements  ActionListener {
    
    ServerModel model;
    ServerView view;
    int port;
    String serverName;
    boolean open;
    
    
    public ServerController(ServerView serverView, String serverName, int port) {
        this.view = serverView;
        this.port = port;
        this.serverName = serverName;
        this.open = false;
        this.view.getStatus_button().addActionListener((e) -> {
            if(open){
                this.closeServer();
                view.getStatus_button().setText("Abrir servidor");
            }else{
                this.initServer();
                view.getStatus_button().setText("Cerrar servidor");
            }
            open = !open;
        });
        this.view.getServerName_label().setText(serverName);
        this.view.getPort_label().setText("Puerto: " + port);
        this.view.getStatus_button().setText("Abrir servidor");
        this.view.setUserList(new JList());
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }

   private void initServer(){
       view.setTitle(serverName + " corriendo en el puerto " + port);
       addMessage("Servidor iniciado");
       model = new ServerModel(port, view);
       model.start();
   }
   
   private void closeServer(){
       addMessage("Servidor cerrado");
       try {
           model.stopServer();
       } catch (Exception e) {
       }
       
   }
   
   private void addMessage(String message){
       view.getLog().append(message+"\n");
   }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
