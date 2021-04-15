/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Khosravi
 */
public class Nurse extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    public Nurse() {
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
        nurseNameLabel = new javax.swing.JLabel();
        idSickLabel = new javax.swing.JLabel();
        idSickField = new javax.swing.JTextField();
        drugLabel = new javax.swing.JLabel();
        situationSickLabel = new javax.swing.JLabel();
        drugComboBox = new javax.swing.JComboBox<>();
        situationSickComboBox = new javax.swing.JComboBox<>();
        recordButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nurseNameLabel.setFont(new java.awt.Font("B Titr", 1, 42)); // NOI18N
        nurseNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nurseNameLabel.setText("نام پرستار: ");

        idSickLabel.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        idSickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idSickLabel.setText("کد ملی بیمار");

        idSickField.setFont(new java.awt.Font("B Titr", 1, 18)); // NOI18N
        idSickField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        drugLabel.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        drugLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drugLabel.setText("داروی مصرف شده");

        situationSickLabel.setFont(new java.awt.Font("B Titr", 1, 24)); // NOI18N
        situationSickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        situationSickLabel.setText("وضعیت بیمار");

        drugComboBox.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        drugComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "داروی شماره 1", "داروی شماره 2", "داروی شماره 3", "داروی شماره 4" }));

        situationSickComboBox.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        situationSickComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "خوب", "متوسط", "بد" }));

        recordButton.setFont(new java.awt.Font("B Titr", 1, 30)); // NOI18N
        recordButton.setText("ثبت");
        recordButton.setFocusable(false);
        recordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordButtonActionPerformed(evt);
            }
        });

        returnButton.setFont(new java.awt.Font("B Titr", 1, 30)); // NOI18N
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
                    .addComponent(nurseNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(drugComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(drugLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(idSickField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(idSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(situationSickComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(situationSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nurseNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idSickField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drugLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(situationSickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(situationSickComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(recordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Personnel personnel = new Personnel();
        this.setVisible(false);
        personnel.showPanel();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void recordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordButtonActionPerformed
        try {
            if (idSickField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "کد ملی بیمار را وارد کنید.", "خطای سیستم", 0);  
            } else {
            writeSickReport();
            billCalculator(); 
            JOptionPane.showMessageDialog(null, "اطلاعات با موفقیت در سیستم ثبت شد.", "پیغام سیستم", 1);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "همچین بیماری وجود ندارد.", "خطای سیستم", 0);
        }
    }//GEN-LAST:event_recordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nurse().setVisible(true);
            }
        });
    }

    public void showPanel() throws IOException {
        this.setVisible(true);
        this.setResizable(false);
        usernameNurseReader();
        setCenter();
    }

    public void setCenter() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dimension.width / 2 - this.getSize().width / 2, dimension.height / 2 - this.getSize().height / 2);
    }

    public void usernameNurseReader() throws FileNotFoundException, IOException {

        String username = Personnel.idPersonnelField.getText();

        File IDfile = new File("src\\main\\java\\data\\personnel\\nurse\\" + username + " - name.txt");
        FileReader IDfileReader = new FileReader(IDfile);
        BufferedReader IDReader = new BufferedReader(IDfileReader);

        String idText = IDReader.readLine();

        nurseNameLabel.setText(idText);

    }

    public void writeSickReport() throws IOException {
        String id = this.idSickField.getText();
        String drug = this.drugComboBox.getSelectedItem().toString();
        String situation = this.situationSickComboBox.getSelectedItem().toString();
        String username = Personnel.idPersonnelField.getText();

        File IDfile = new File("src\\main\\java\\data\\personnel\\nurse\\" + username + " - name.txt");
        FileReader IDfileReader = new FileReader(IDfile);
        BufferedReader IDReader = new BufferedReader(IDfileReader);

        String name = IDReader.readLine();

        String report = name + ")   داروی مصرف شده: " + drug + "،   وضعیت حال بیمار: " + situation;

        File nurseSick = new File("src\\main\\java\\data\\sick\\" + id + " - report.txt");
        FileWriter fileWriter = new FileWriter(nurseSick, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(report + "\r\n");
        writer.flush();
        writer.close();
    }

    public void billCalculator() throws IOException {
        String id = this.idSickField.getText();
        String drug = this.drugComboBox.getSelectedItem().toString();

        File billCal = new File("src\\main\\java\\data\\sick\\" + id + " - bill.txt");
        FileWriter fileWriter = new FileWriter(billCal, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        if (drug.equals("داروی شماره 1")) {
            writer.write("100000\r\n");
            writer.flush();
            writer.close();
        }

        if (drug.equals("داروی شماره 2")) {
            writer.write("200000\r\n");
            writer.flush();
            writer.close();
        }
        
        if (drug.equals("داروی شماره 3")) {
            writer.write("300000\r\n");
            writer.flush();
            writer.close();
        }
        
        if (drug.equals("داروی شماره 4")) {
            writer.write("400000\r\n");
            writer.flush();
            writer.close();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> drugComboBox;
    private javax.swing.JLabel drugLabel;
    private javax.swing.JTextField idSickField;
    private javax.swing.JLabel idSickLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nurseNameLabel;
    private javax.swing.JButton recordButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JComboBox<String> situationSickComboBox;
    private javax.swing.JLabel situationSickLabel;
    // End of variables declaration//GEN-END:variables
}
