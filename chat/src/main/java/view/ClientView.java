
package view;

import java.awt.event.WindowListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;

public class ClientView extends javax.swing.JFrame {

    public ClientView() {
        initComponents();
        listModel = new DefaultListModel();
        connected_list.setModel(listModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        message_txt = new javax.swing.JTextArea();
        send_button = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        connected_list = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();
        connected_label = new javax.swing.JLabel();
        serverName_label = new javax.swing.JLabel();
        user_label = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        message_txt.setColumns(20);
        message_txt.setRows(5);
        jScrollPane1.setViewportView(message_txt);

        send_button.setText("Enviar");

        jScrollPane3.setViewportView(connected_list);

        log.setEditable(false);
        log.setColumns(20);
        log.setRows(5);
        log.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(log);

        connected_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        connected_label.setText("Conectados");
        connected_label.setToolTipText("");

        serverName_label.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        serverName_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        serverName_label.setText("Server_name");
        serverName_label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        user_label.setText("user_name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(send_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_label)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(serverName_label)
                        .addGap(474, 474, 474)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(connected_label)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverName_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(connected_label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(send_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connected_label;
    private javax.swing.JList<String> connected_list;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea log;
    private javax.swing.JTextArea message_txt;
    private javax.swing.JButton send_button;
    private javax.swing.JLabel serverName_label;
    private javax.swing.JLabel user_label;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel listModel;
    
    public JLabel getConnected_label() {
        return connected_label;
    }

    public void setConnected_label(JLabel connected_label) {
        this.connected_label = connected_label;
    }

    public JList<String> getConnected_list() {
        return connected_list;
    }

    public void setConnected_list(JList<String> connected_list) {
        this.connected_list = connected_list;
    }

    public JTextArea getLog() {
        return log;
    }

    public void setLog(JTextArea log) {
        this.log = log;
    }

    public JTextArea getMessage_txt() {
        return message_txt;
    }

    public void setMessage_txt(JTextArea message_txt) {
        this.message_txt = message_txt;
    }

    public JButton getSend_button() {
        return send_button;
    }

    public void setSend_button(JButton send_button) {
        this.send_button = send_button;
    }

    public JLabel getServerName_label() {
        return serverName_label;
    }

    public void setServerName_label(JLabel serverName_label) {
        this.serverName_label = serverName_label;
    }

    public DefaultListModel getListModel() {
        return listModel;
    }

    public void setListModel(DefaultListModel listModel) {
        this.listModel = listModel;
    }

    public JLabel getUser_label() {
        return user_label;
    }

    public void setUser_label(JLabel user_label) {
        this.user_label = user_label;
    }
    
}
