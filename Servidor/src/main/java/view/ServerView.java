package view;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ServerView extends javax.swing.JFrame {

    public ServerView() {
        initComponents();
        listModel = new DefaultListModel();
        userList.setModel(listModel);
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        serverName_label = new javax.swing.JLabel();
        status_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        port_label = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(userList);

        serverName_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        serverName_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        serverName_label.setText("Server_name");
        serverName_label.setFocusTraversalPolicyProvider(true);
        serverName_label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        status_button.setText("status_button");
        status_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_buttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Conectados");

        port_label.setText("Port");

        log.setEditable(false);
        log.setColumns(20);
        log.setRows(5);
        jScrollPane3.setViewportView(log);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(port_label)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serverName_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status_button)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverName_label)
                    .addComponent(status_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(port_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void status_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_buttonActionPerformed
        
    }//GEN-LAST:event_status_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea log;
    private javax.swing.JLabel port_label;
    private javax.swing.JLabel serverName_label;
    private javax.swing.JButton status_button;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel listModel;
    
    
    public JButton getStatus_button() {
        return status_button;
    }

    public void setStatus_buttonn(JButton status_button) {
        this.status_button = status_button;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JTextArea getLog() {
        return log;
    }

    public void setLog(JTextArea log) {
        this.log = log;
    }

    public JLabel getPort_label() {
        return port_label;
    }

    public void setPort_label(JLabel port_label) {
        this.port_label = port_label;
    }

    public JLabel getServerName_label() {
        return serverName_label;
    }

    public void setServerName_label(JLabel serverName_label) {
        this.serverName_label = serverName_label;
    }

    public JList<String> getUserList() {
        return userList;
    }

    public void setUserList(JList<String> userList) {
        this.userList = userList;
    }

    public DefaultListModel getListModel() {
        return listModel;
    }

    public void setListModel(DefaultListModel listModel) {
        this.listModel = listModel;
    }

    
    
}
