/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import java.awt.Color;
import javax.swing.BorderFactory;
import utility.BD_Utility;

/**
 *
 * @author aravi
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        BD_Utility.setImage(this,"images/abc1_1.jpg", 1366, 768);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.black));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnViewUser = new javax.swing.JButton();
        btnRegisterUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeteleUser = new javax.swing.JButton();
        btngenerateQR = new javax.swing.JButton();
        btnViewQR = new javax.swing.JButton();
        btnMarkAttendance = new javax.swing.JButton();
        btnViewAttendance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnViewUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewUser.setText("View User");
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });

        btnRegisterUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegisterUser.setText("Register User");
        btnRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateUser.setText("Update User");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnDeteleUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeteleUser.setText("Delete User");
        btnDeteleUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeteleUserActionPerformed(evt);
            }
        });

        btngenerateQR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btngenerateQR.setText("Generate QR");
        btngenerateQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateQRActionPerformed(evt);
            }
        });

        btnViewQR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewQR.setText("View QRs");
        btnViewQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewQRActionPerformed(evt);
            }
        });

        btnMarkAttendance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMarkAttendance.setText("Mark Attendance");
        btnMarkAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkAttendanceActionPerformed(evt);
            }
        });

        btnViewAttendance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewAttendance.setText("View Attendance");
        btnViewAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAttendanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDeteleUser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btngenerateQR)
                .addGap(40, 40, 40)
                .addComponent(btnViewQR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnMarkAttendance)
                .addGap(27, 27, 27)
                .addComponent(btnViewAttendance)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnViewAttendance)
                        .addComponent(btnMarkAttendance)
                        .addComponent(btnViewQR)
                        .addComponent(btngenerateQR)
                        .addComponent(btnDeteleUser)
                        .addComponent(btnUpdateUser)
                        .addComponent(btnViewUser)
                        .addComponent(btnRegisterUser)))
                .addGap(737, 737, 737))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        BD_Utility.openform(ViewUser.class.getSimpleName(), new ViewUser());
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUserActionPerformed
        BD_Utility.openform(UserRegister.class.getSimpleName(), new UserRegister());
    }//GEN-LAST:event_btnRegisterUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
         BD_Utility.openform(UpdateUser.class.getSimpleName(), new UpdateUser());
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnDeteleUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeteleUserActionPerformed
         BD_Utility.openform(DeleteUser.class.getSimpleName(), new DeleteUser());

    }//GEN-LAST:event_btnDeteleUserActionPerformed

    private void btngenerateQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateQRActionPerformed
        BD_Utility.openform(Generate_QR.class.getSimpleName(), new Generate_QR());
    }//GEN-LAST:event_btngenerateQRActionPerformed

    private void btnViewQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewQRActionPerformed
       BD_Utility.openform(ViewQR.class.getSimpleName(), new ViewQR());
    }//GEN-LAST:event_btnViewQRActionPerformed

    private void btnMarkAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkAttendanceActionPerformed
        BD_Utility.openform(Mark_Attendance.class.getSimpleName(),new Mark_Attendance());
    }//GEN-LAST:event_btnMarkAttendanceActionPerformed

    private void btnViewAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAttendanceActionPerformed
        BD_Utility.openform(ViewAttendance.class.getSimpleName(), new ViewAttendance());
    }//GEN-LAST:event_btnViewAttendanceActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeteleUser;
    private javax.swing.JButton btnMarkAttendance;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnViewAttendance;
    private javax.swing.JButton btnViewQR;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JButton btngenerateQR;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
