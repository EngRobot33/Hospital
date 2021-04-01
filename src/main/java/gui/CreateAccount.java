/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.gui;

import java.io.*;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Khosravi
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idSickLabel = new javax.swing.JLabel();
        idSickField = new javax.swing.JTextField();
        nameSickLabel = new javax.swing.JLabel();
        nameSickField = new javax.swing.JTextField();
        familySickLabel = new javax.swing.JLabel();
        familySickField = new javax.swing.JTextField();
        ageSickLabel = new javax.swing.JLabel();
        ageSickField = new javax.swing.JTextField();
        sexSickLabel = new javax.swing.JLabel();
        sexSickField = new javax.swing.JTextField();
        illnessSickLabel = new javax.swing.JLabel();
        illnessSickField = new javax.swing.JTextField();
        hsitorySickLabel = new javax.swing.JLabel();
        historySickField = new javax.swing.JTextField();
        createAccountButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("B Titr", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ایجاد حساب کاربری بیمار");

        idSickLabel.setFont(new java.awt.Font("B Titr", 1, 22)); // NOI18N
        idSickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idSickLabel.setText("کد ملی");

        idSickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        idSickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nameSickLabel.setFont(new java.awt.Font("B Titr", 1, 22)); // NOI18N
        nameSickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameSickLabel.setText("نام");

        nameSickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        nameSickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        familySickLabel.setFont(new java.awt.Font("B Titr", 1, 22)); // NOI18N
        familySickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        familySickLabel.setText("نام خانوادگی");

        familySickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        familySickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ageSickLabel.setFont(new java.awt.Font("B Titr", 1, 22)); // NOI18N
        ageSickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ageSickLabel.setText("سن");

        ageSickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        ageSickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sexSickLabel.setFont(new java.awt.Font("B Titr", 1, 22)); // NOI18N
        sexSickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sexSickLabel.setText("جنسیت");

        sexSickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        sexSickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        illnessSickLabel.setFont(new java.awt.Font("B Titr", 1, 22)); // NOI18N
        illnessSickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        illnessSickLabel.setText("شرح بیماری");

        illnessSickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        illnessSickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hsitorySickLabel.setFont(new java.awt.Font("B Titr", 1, 22)); // NOI18N
        hsitorySickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hsitorySickLabel.setText("سوابق بیماری خاص");

        historySickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        historySickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        createAccountButton.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        createAccountButton.setText("ایجاد حساب");
        createAccountButton.setFocusable(false);
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        returnButton.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        returnButton.setText("بازگشت");
        returnButton.setFocusable(false);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexSickField)
                            .addComponent(familySickField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(familySickLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(sexSickLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(idSickField, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameSickField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(ageSickField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageSickLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameSickLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(illnessSickField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(illnessSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(historySickField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hsitorySickLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idSickField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSickField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familySickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familySickField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageSickField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexSickField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(illnessSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(illnessSickField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hsitorySickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historySickField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        Accountant accountant = new Accountant();
        this.setVisible(false);
        accountant.showPanel();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed

        
        try {
            randomPassCodeGenerator();
            writeSickID();
            writeSickName();
            writeSickFamily();
            writeSickAge();
            writeSickSex();
            writeSickIllness();
            writeSickHistory();
            JOptionPane.showInternalMessageDialog(null, "حساب کاربری با موفقیت ساخته شد.", "پیغام سیستم", 1);  
        } catch (IOException ex) {
            Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_createAccountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    public void showPanel() {
        this.setVisible(true);
    }

    public void writeSickID() throws IOException {
        String id = this.idSickField.getText();
        File idSick = new File("src\\main\\java\\data\\sick\\" + id + " - id.txt");
        FileWriter fileWriter = new FileWriter(idSick);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(id);
        writer.flush();
        writer.close();
    }
    
    public void writeSickName() throws IOException {
        String id = this.idSickField.getText();
        String name = this.nameSickField.getText();
        File nameSick = new File("src\\main\\java\\data\\sick\\" + id + " - name.txt");
        FileWriter fileWriter = new FileWriter(nameSick);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(name);
        writer.flush();
        writer.close();
    }

    public void writeSickFamily() throws IOException {
        String id = this.idSickField.getText();
        String family = this.familySickField.getText();
        File familySick = new File("src\\main\\java\\data\\sick\\" + id + " - family.txt");
        FileWriter fileWriter = new FileWriter(familySick);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(family);
        writer.flush();
        writer.close();
    }

    public void writeSickAge() throws IOException {
        String id = this.idSickField.getText();
        String age = this.ageSickField.getText();
        File familySick = new File("src\\main\\java\\data\\sick\\" + id + " - age.txt");
        FileWriter fileWriter = new FileWriter(familySick);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(age);
        writer.flush();
        writer.close();
    }
    
    public void writeSickSex() throws IOException {
        String id = this.idSickField.getText();
        String sex = this.sexSickField.getText();
        File sexSick = new File("src\\main\\java\\data\\sick\\" + id + " - sex.txt");
        FileWriter fileWriter = new FileWriter(sexSick);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(sex);
        writer.flush();
        writer.close();
    }
    
    public void writeSickIllness() throws IOException {
        String id = this.idSickField.getText();
        String illness = this.illnessSickField.getText();
        File illnessSick = new File("src\\main\\java\\data\\sick\\" + id + " - illness.txt");
        FileWriter fileWriter = new FileWriter(illnessSick);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(illness);
        writer.flush();
        writer.close();
    }
    
    public void writeSickHistory() throws IOException {
        String id = this.idSickField.getText();
        String history = this.historySickField.getText();
        File historySick = new File("src\\main\\java\\data\\sick\\" + id + " - history.txt");
        FileWriter fileWriter = new FileWriter(historySick);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(history);
        writer.flush();
        writer.close();
    }
    
    public void randomPassCodeGenerator() throws IOException{
        SecureRandom random = new SecureRandom();
        int passcodeInt = random.nextInt(90000000) + 10000000;
        String passcode = passcodeInt + "";
        String id = this.idSickField.getText();
        File codeSick = new File("src\\main\\java\\data\\sick\\" + id + " - code.txt");
        FileWriter fileWriter = new FileWriter(codeSick);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(passcode);
        writer.flush();
        writer.close();
        
        JOptionPane.showInternalMessageDialog(null, passcode, "رمز عبور بیمار", 1);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageSickField;
    private javax.swing.JLabel ageSickLabel;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField familySickField;
    private javax.swing.JLabel familySickLabel;
    private javax.swing.JTextField historySickField;
    private javax.swing.JLabel hsitorySickLabel;
    private javax.swing.JTextField idSickField;
    private javax.swing.JLabel idSickLabel;
    private javax.swing.JTextField illnessSickField;
    private javax.swing.JLabel illnessSickLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameSickField;
    private javax.swing.JLabel nameSickLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField sexSickField;
    private javax.swing.JLabel sexSickLabel;
    // End of variables declaration//GEN-END:variables
}
