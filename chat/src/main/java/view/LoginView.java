package view;

import java.awt.Dialog;
import static java.awt.SystemColor.text;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


public class LoginView extends javax.swing.JFrame {


    public LoginView() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        connect_button = new javax.swing.JButton();
        user_txt = new javax.swing.JTextField();
        user_label = new javax.swing.JLabel();
        port_label = new javax.swing.JLabel();
        port_txt = new javax.swing.JTextField();
        ipServer_label = new javax.swing.JLabel();
        ip_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conectarse");
        setLocation(new java.awt.Point(50, 0));
        setResizable(false);

        connect_button.setText("Conectar");
        connect_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_buttonActionPerformed(evt);
            }
        });

        user_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                user_txtKeyTyped(evt);
            }
        });

        user_label.setText("Usuario");

        port_label.setText("Puerto");

        port_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                port_txtKeyTyped(evt);
            }
        });

        ipServer_label.setText("Mi IP");

        ip_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ip_txtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addComponent(connect_button)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(user_label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(port_label)
                            .addGap(10, 10, 10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ipServer_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(port_txt)
                    .addComponent(ip_txt)
                    .addComponent(user_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_label))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ip_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipServer_label))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(port_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(port_label))
                .addGap(18, 18, 18)
                .addComponent(connect_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connect_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_buttonActionPerformed
        String user = user_txt.getText();
        String servidor = port_txt.getText();

        


    }//GEN-LAST:event_connect_buttonActionPerformed

    private void user_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_txtKeyTyped
        if (user_txt.getText().length() > 10) {
            evt.consume();
            System.out.println("consumido");
        }
    }//GEN-LAST:event_user_txtKeyTyped

    private void port_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_port_txtKeyTyped
        if (!Character.toString(evt.getKeyChar()).matches("[0-9]")) {
            evt.consume();
        }
        if (port_txt.getText().length() > 3) {
            evt.consume();
        }
    }//GEN-LAST:event_port_txtKeyTyped

    private void ip_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ip_txtKeyTyped
        if (!Character.toString(evt.getKeyChar()).matches("[\\d|\\.]")) {
            evt.consume();
        }
        if (ip_txt.getText().length() > 14) {
            evt.consume();
        }
    }//GEN-LAST:event_ip_txtKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connect_button;
    private javax.swing.JLabel ipServer_label;
    private javax.swing.JTextField ip_txt;
    private javax.swing.JLabel port_label;
    private javax.swing.JTextField port_txt;
    private javax.swing.JLabel user_label;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables

    public JButton getConnect_button() {
        return connect_button;
    }

    public void setConnect_button(JButton connect_button) {
        this.connect_button = connect_button;
    }

    public JLabel getPort_label() {
        return port_label;
    }

    public void setPort_label(JLabel port_label) {
        this.port_label = port_label;
    }

    public JTextField getPort_txt() {
        return port_txt;
    }

    public void setPort_txt(JTextField port_txt) {
        this.port_txt = port_txt;
    }

    public JLabel getUser_label() {
        return user_label;
    }

    public void setUser_label(JLabel user_label) {
        this.user_label = user_label;
    }

    public JTextField getUser_txt() {
        return user_txt;
    }

    public void setUser_txt(JTextField user_txt) {
        this.user_txt = user_txt;
    }

    public JLabel getIpServer_label() {
        return ipServer_label;
    }

    public void setIpServer_label(JLabel ipServer_label) {
        this.ipServer_label = ipServer_label;
    }

    public JTextField getIp_txt() {
        return ip_txt;
    }

    public void setIp_txt(JTextField ip_txt) {
        this.ip_txt = ip_txt;
    }

    
}
