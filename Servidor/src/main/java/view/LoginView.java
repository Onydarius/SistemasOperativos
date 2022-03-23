package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        connect_button = new javax.swing.JButton();
        port_label = new javax.swing.JLabel();
        port_txt = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();

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

        port_label.setText("Puerto");

        port_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                port_txtKeyTyped(evt);
            }
        });

        name_label.setText("Nombre");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(port_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(port_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(port_label)
                    .addComponent(port_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(connect_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connect_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_buttonActionPerformed
        
    }//GEN-LAST:event_connect_buttonActionPerformed

    public JButton getConnect_button() {
        return connect_button;
    }

    public void setConnect_button(JButton connect_button) {
        this.connect_button = connect_button;
    }

    public JLabel getName_label() {
        return name_label;
    }

    public void setName_label(JLabel name_label) {
        this.name_label = name_label;
    }

    public JTextField getName_txt() {
        return name_txt;
    }

    public void setName_txt(JTextField name_txt) {
        this.name_txt = name_txt;
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

    private void port_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_port_txtKeyTyped
        if (!Character.toString(evt.getKeyChar()).matches("[0-9]")) {
            evt.consume();
        }
        if (port_txt.getText().length() > 3) {
            evt.consume();
        }
    }//GEN-LAST:event_port_txtKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connect_button;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel port_label;
    private javax.swing.JTextField port_txt;
    // End of variables declaration//GEN-END:variables


}
