
package mini.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mini.pojo.UserProfilePojo;

/**
 *
 * @author bikrant bikram
 */
public class AdminOptionFrame extends javax.swing.JFrame {

    public AdminOptionFrame() {
        initComponents();
        super.setIconImage(new ImageIcon(getClass().getResource("/images/LogoFinal.PNG")).getImage());    
        super.setTitle("MINI");    
        this.setLocationRelativeTo(null);
         lblUserId.setText(UserProfilePojo.getUserId());
        lblUserName.setText(UserProfilePojo.getUserName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbrAddUser = new javax.swing.JRadioButton();
        jbrRemoveUser = new javax.swing.JRadioButton();
        jbrEditUser = new javax.swing.JRadioButton();
        bntDone = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblUserId = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhishek maurya\\Desktop\\mini images\\Capture.PNG")); // NOI18N

        buttonGroup1.add(jbrAddUser);
        jbrAddUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbrAddUser.setForeground(new java.awt.Color(0, 51, 102));
        jbrAddUser.setText("Add User");

        buttonGroup1.add(jbrRemoveUser);
        jbrRemoveUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbrRemoveUser.setForeground(new java.awt.Color(0, 51, 102));
        jbrRemoveUser.setText("Remove user");

        buttonGroup1.add(jbrEditUser);
        jbrEditUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbrEditUser.setForeground(new java.awt.Color(0, 51, 102));
        jbrEditUser.setText("Edit User ");

        bntDone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bntDone.setForeground(new java.awt.Color(0, 51, 102));
        bntDone.setText("Done");
        bntDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDoneActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 51, 102));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblUserId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(0, 51, 102));
        lblUserId.setText("userId");

        lblUserName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 51, 102));
        lblUserName.setText("Username");

        lblLogout.setForeground(new java.awt.Color(0, 51, 102));
        lblLogout.setText("logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbrAddUser)
                    .addComponent(jbrRemoveUser)
                    .addComponent(jbrEditUser)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntDone)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose)))
                .addGap(0, 111, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogout)
                        .addGap(80, 80, 80)
                        .addComponent(jbrAddUser)
                        .addGap(18, 18, 18)
                        .addComponent(jbrRemoveUser)
                        .addGap(18, 18, 18)
                        .addComponent(jbrEditUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntDone)
                            .addComponent(btnClose))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblUserId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame loginFrame= new LoginFrame();
        loginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:

        lblLogout.setForeground(Color.BLUE);
        Font f= new Font("Tohoma",Font.ITALIC,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        Color c= new Color(205,102,0);

        lblLogout.setForeground(c);
        Font f= new Font("Tohoma",Font.PLAIN,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void bntDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDoneActionPerformed
        
        
        if(jbrAddUser.isSelected())
        {
           AddUserFrame   addUserFrame= new  AddUserFrame();
           addUserFrame.setVisible(true);
           this.dispose();
        }
        else if(jbrRemoveUser.isSelected())
        {
           RemoveUserFrame  removeUserFrame= new  RemoveUserFrame();
           removeUserFrame.setVisible(true);
        this.dispose();
            
        }
        else if(jbrEditUser.isSelected())
        {
            EditUserFrame editUserFrame= new  EditUserFrame() ;
             editUserFrame.setVisible(true);   
         this.dispose();
        }
        else
             JOptionPane.showMessageDialog(null, "Plase make a selection",JOptionPane.MESSAGE_PROPERTY,JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
        
        
    }//GEN-LAST:event_bntDoneActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        int ans=   JOptionPane.showConfirmDialog(null,"are u sure ","conformation",JOptionPane.INFORMATION_MESSAGE,JOptionPane.YES_NO_OPTION);
        if(ans!=JOptionPane.YES_OPTION)
            return;
        LoginFrame  loginFrame= new  LoginFrame();
         loginFrame.setVisible(true);
         this.dispose();
         
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDone;
    private javax.swing.JButton btnClose;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jbrAddUser;
    private javax.swing.JRadioButton jbrEditUser;
    private javax.swing.JRadioButton jbrRemoveUser;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
