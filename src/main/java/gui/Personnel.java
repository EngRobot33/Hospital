/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.gui;

import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Khosravi
 */
public class Personnel extends javax.swing.JFrame {

    /**
     * Creates new form Personnel
     */
    public Personnel() {
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
        entrancePersonnelLabel = new javax.swing.JLabel();
        idPersonnelField = new javax.swing.JTextField();
        idPersonnelLabel = new javax.swing.JLabel();
        passwordPersonnelField = new javax.swing.JTextField();
        jobPersonnelLabel = new javax.swing.JLabel();
        entranceButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        jobPersonnelComboBox = new javax.swing.JComboBox<>();
        passwordPersonnelLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 173, 181));

        mainPanel.setBackground(new java.awt.Color(81, 196, 211));

        entrancePersonnelLabel.setFont(new java.awt.Font("B Titr", 1, 42)); // NOI18N
        entrancePersonnelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrancePersonnelLabel.setText("ورود پرسنل بیمارستان");

        idPersonnelField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        idPersonnelField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        idPersonnelLabel.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        idPersonnelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idPersonnelLabel.setText("شماره پرسنلی");

        passwordPersonnelField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        passwordPersonnelField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jobPersonnelLabel.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        jobPersonnelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jobPersonnelLabel.setText("سمت");

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

        jobPersonnelComboBox.setBackground(new java.awt.Color(170, 216, 211));
        jobPersonnelComboBox.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jobPersonnelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "پزشک", "پرستار" }));

        passwordPersonnelLabel.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        passwordPersonnelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordPersonnelLabel.setText("رمز عبور");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entrancePersonnelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
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
                        .addComponent(idPersonnelField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idPersonnelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jobPersonnelComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordPersonnelField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jobPersonnelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordPersonnelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entrancePersonnelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPersonnelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPersonnelField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordPersonnelField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordPersonnelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobPersonnelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobPersonnelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(entranceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        try {
            if (jobPersonnelComboBox.getSelectedItem().toString().equals("پزشک")) {
                readDoctorUsername();
            }
            if (jobPersonnelComboBox.getSelectedItem().toString().equals("پرستار")) {
                readNurseUsername();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "شماره پرسنلی یا رمز عبور را وارد کنید.", "خطای سیستم", 0);
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
            java.util.logging.Logger.getLogger(Personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personnel().setVisible(true);
            }
        });
    }

    public void showPanel() {
        this.setResizable(false);
        this.setVisible(true);
        setCenter();
        setTitle("پرسنل");
    }
    
    public void setCenter() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dimension.width / 2 - this.getSize().width / 2, dimension.height / 2 - this.getSize().height / 2);
    }

    public void readDoctorUsername() throws FileNotFoundException, IOException {

        String username = idPersonnelField.getText();
        String password = passwordPersonnelField.getText();

        File IDfile = new File("src\\main\\database\\personnel\\doctor\\" + username + " - info.txt");
        FileReader IDfileReader = new FileReader(IDfile);
        BufferedReader IDReader = new BufferedReader(IDfileReader);
        
        String text = "";
            String line;
            while ((line = IDReader.readLine()) != null) {
                text += line + "---";
            }

            String[] data = text.split("---");


        if (username.equals(data[1]) && password.equals(data[1])) {
            if (jobPersonnelComboBox.getSelectedItem().toString().equalsIgnoreCase("پزشک")) {
                Doctor doctor = new Doctor();
                this.setVisible(false);
                doctor.showPanel();
            }
        }
    }

    public void readNurseUsername() throws FileNotFoundException, IOException {

        String username = idPersonnelField.getText();
        String password = passwordPersonnelField.getText();

        File IDfile = new File("src\\main\\database\\personnel\\nurse\\" + username + " - info.txt");
        FileReader IDfileReader = new FileReader(IDfile);
        BufferedReader IDReader = new BufferedReader(IDfileReader);
        
        String text = "";
            String line;
            while ((line = IDReader.readLine()) != null) {
                text += line + "---";
            }

            String[] data = text.split("---");

        if (username.equals(data[1]) && password.equals(data[1])) {
            if (jobPersonnelComboBox.getSelectedItem().toString().equalsIgnoreCase("پرستار")) {
                Nurse nurse = new Nurse();
                this.setVisible(false);
                nurse.showPanel();
            }
        } else {
            JOptionPane.showInternalMessageDialog(null, "اطلاعات وارد شده صحیح نمی باشد.", "پیغام سیستم", 0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entranceButton;
    private javax.swing.JLabel entrancePersonnelLabel;
    public static javax.swing.JTextField idPersonnelField;
    private javax.swing.JLabel idPersonnelLabel;
    private javax.swing.JComboBox<String> jobPersonnelComboBox;
    private javax.swing.JLabel jobPersonnelLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField passwordPersonnelField;
    private javax.swing.JLabel passwordPersonnelLabel;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
