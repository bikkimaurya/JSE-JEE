
package mini.gui;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mini.dao.StudentDao;
import mini.pojo.UserProfilePojo;

/**
 *
 * @author bikrant bikram
 */
public class UserOptionFrame extends javax.swing.JFrame {

    public UserOptionFrame() {
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jbrBusMgmt = new javax.swing.JRadioButton();
        jbrInquiryMgmt = new javax.swing.JRadioButton();
        jbrContact = new javax.swing.JRadioButton();
        jbrHostelMgmt = new javax.swing.JRadioButton();
        btnEnter = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        btnGatePass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhishek maurya\\Desktop\\mini images\\Userlogo.PNG")); // NOI18N

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

        lblUserId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(0, 51, 102));
        lblUserId.setText("userId");

        lblUserName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 51, 102));
        lblUserName.setText("Username");

        jbrBusMgmt.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jbrBusMgmt);
        jbrBusMgmt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbrBusMgmt.setForeground(new java.awt.Color(0, 51, 102));
        jbrBusMgmt.setText("Bus Management");

        jbrInquiryMgmt.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jbrInquiryMgmt);
        jbrInquiryMgmt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbrInquiryMgmt.setForeground(new java.awt.Color(0, 51, 102));
        jbrInquiryMgmt.setText("Inquiry management");

        jbrContact.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jbrContact);
        jbrContact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbrContact.setForeground(new java.awt.Color(0, 51, 102));
        jbrContact.setText("Contact");

        jbrHostelMgmt.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jbrHostelMgmt);
        jbrHostelMgmt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbrHostelMgmt.setForeground(new java.awt.Color(0, 51, 102));
        jbrHostelMgmt.setText("Hostel Management");

        btnEnter.setBackground(new java.awt.Color(0, 51, 102));
        btnEnter.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(0, 51, 102));
        btnQuit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnGatePass.setText("Gate Pass");
        btnGatePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGatePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbrInquiryMgmt)
                            .addComponent(jbrContact)
                            .addComponent(jbrHostelMgmt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbrBusMgmt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addComponent(btnGatePass))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName)
                            .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnEnter)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuit)))
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogout)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(lblUserId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUserName)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbrBusMgmt)
                            .addComponent(btnGatePass))
                        .addGap(18, 18, 18)
                        .addComponent(jbrInquiryMgmt)
                        .addGap(18, 18, 18)
                        .addComponent(jbrContact)
                        .addGap(18, 18, 18)
                        .addComponent(jbrHostelMgmt)
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnter)
                            .addComponent(btnQuit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame loginFrame= new LoginFrame();
        loginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered

        lblLogout.setForeground(Color.BLUE);
        Font f= new Font("Tohoma",Font.ITALIC,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited

        Color c= new Color(205,102,0);

        lblLogout.setForeground(c);
        Font f= new Font("Tohoma",Font.PLAIN,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        if(jbrBusMgmt.isSelected())
        {
            BusManagementOptionFrame busManagementFrame= new BusManagementOptionFrame();
            busManagementFrame.setVisible(true);
            this.dispose();
            
        }
        else if(jbrInquiryMgmt.isSelected())
        {
            InquiryManagementOptionFrame inquiryManagementOptionFrame = new InquiryManagementOptionFrame ();
            inquiryManagementOptionFrame.setVisible(true);
            this.dispose();
            
        }
        else if(jbrContact.isSelected())
        {
          ContactManagementOptionFrame contactOptionFrame = new    ContactManagementOptionFrame()   ;
          contactOptionFrame.setVisible(rootPaneCheckingEnabled);
          this.dispose();
  
            
        }
        else if(jbrHostelMgmt.isSelected())
        {
           HostelManagementOptionFrame hostelManagementOptionFrame = new HostelManagementOptionFrame();
           hostelManagementOptionFrame.setVisible(true);
           this.dispose();
            
        }
        else
            JOptionPane.showMessageDialog(null,"Please make a selection");

    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
     
                
        int ans=   JOptionPane.showConfirmDialog(null,"are u sure ","conformation",JOptionPane.INFORMATION_MESSAGE,JOptionPane.YES_NO_OPTION);
        if(ans!=JOptionPane.YES_OPTION)
            return;
        LoginFrame loginFrame= new LoginFrame() ;
        loginFrame.setVisible(true);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnGatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGatePassActionPerformed
        
            try {
            //      StudentEntryFrame studentEntryFrame= new StudentEntryFrame();
//      studentEntryFrame.setVisible(true);
//      this.dispose(); 
String no= JOptionPane.showInputDialog(null,"ENter enrollment no","enrollment required",JOptionPane.INFORMATION_MESSAGE);
if(no==null)return;
no= no.toUpperCase();
String name;
if((name=StudentDao.getName(no))!=null)
{
    JOptionPane.showMessageDialog(null, "available in database with name "+ name.toUpperCase());
    
}


else 
{
    JOptionPane.showMessageDialog(null, "not available in database ");
}
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnGatePassActionPerformed

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
            java.util.logging.Logger.getLogger(UserOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnGatePass;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jbrBusMgmt;
    private javax.swing.JRadioButton jbrContact;
    private javax.swing.JRadioButton jbrHostelMgmt;
    private javax.swing.JRadioButton jbrInquiryMgmt;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
