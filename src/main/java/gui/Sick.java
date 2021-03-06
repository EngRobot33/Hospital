/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Khosravi
 */
public class Sick extends javax.swing.JFrame {

    /**
     * Creates new form Sick
     */
    public Sick() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        sickLabel = new javax.swing.JLabel();
        idSickLabel = new javax.swing.JLabel();
        passwordSickLabel = new javax.swing.JLabel();
        passwordSickField = new javax.swing.JTextField();
        idSickField = new javax.swing.JTextField();
        entranceButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(81, 196, 211));

        sickLabel.setFont(new java.awt.Font("B Titr", 1, 42)); // NOI18N
        sickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sickLabel.setText("ورود بیمار");

        idSickLabel.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        idSickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idSickLabel.setText("کد ملی");

        passwordSickLabel.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        passwordSickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordSickLabel.setText("رمز عبور");

        passwordSickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        passwordSickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        idSickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        idSickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        entranceButton.setBackground(new java.awt.Color(170, 216, 211));
        entranceButton.setFont(new java.awt.Font("B Titr", 1, 30)); // NOI18N
        entranceButton.setText("ورود");
        entranceButton.setFocusable(false);
        entranceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entranceButtonActionPerformed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(170, 216, 211));
        returnButton.setFont(new java.awt.Font("B Titr", 1, 30)); // NOI18N
        returnButton.setText("بازگشت");
        returnButton.setFocusable(false);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sickLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entranceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(passwordSickField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(idSickField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idSickField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordSickField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addComponent(entranceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        Menu mainframe = new Menu();
        this.setVisible(false);
        mainframe.showPanel();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void entranceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entranceButtonActionPerformed
        if (idSickField.getText().isEmpty() || passwordSickField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "کد ملی و رمز عبور را وارد کنید.", "پیغام سیستم", 0);
        } else {
            IDReader();
        }
    }//GEN-LAST:event_entranceButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sick().setVisible(true);
            }
        });
    }

    public void showPanel() {
        this.setResizable(false);
        this.setVisible(true);
        setCenter();
        setTitle("بیمار");
    }

    public void setCenter() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dimension.width / 2 - this.getSize().width / 2, dimension.height / 2 - this.getSize().height / 2);
    }

    public void IDReader() {

        String id = idSickField.getText();
        String password = passwordSickField.getText();

        try {

            File file = new File("src\\main\\database\\sick\\" + id + " - info.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String text = "";
            String line;
            while ((line = reader.readLine()) != null) {
                text += line + "---";
            }

            String[] data = text.split("---");

            String idText = data[0];
            String codeText = data[7];
            

            if (idText.equals(data[0]) && codeText.equals(data[7])) {
                SickAccount sickAccount = new SickAccount();
                this.setVisible(false);
                sickAccount.showPanel();

            } else {
                JOptionPane.showMessageDialog(null, "نام کاربری یا رمز عبور اشتباه می باشد.", "اخطار سیستم", 0);
            }

            reader.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "اطلاعات نادرست وارد شده است.", "پیغام سیستم", 0);
            System.out.println(e.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entranceButton;
    public static javax.swing.JTextField idSickField;
    private javax.swing.JLabel idSickLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField passwordSickField;
    private javax.swing.JLabel passwordSickLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel sickLabel;
    // End of variables declaration//GEN-END:variables

}
