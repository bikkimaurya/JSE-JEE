/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mini.dao.BusDao;
import mini.dao.BusManagementDao;
import mini.dao.DriverDao;
import mini.dao.PositionDao;
import mini.dao.RoutDao;
import mini.pojo.BusManagementPojo;
import mini.pojo.UserProfilePojo;

/**
 *
 * @author bikrant bikram
 */
public class BusArrangementOptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form BusArrangementFarme
     */
    public BusArrangementOptionFrame() {
        initComponents();
        super.setIconImage(new ImageIcon(getClass().getResource("/images/LogoFinal.PNG")).getImage());    
        super.setTitle("MINI");    
        this.setLocationRelativeTo(null);
//         lblUserId.setText(UserProfilePojo.getUserId());
//        lblUserName.setText(UserProfilePojo.getUserName());
        try {
           ArrayList<Integer> al= PositionDao.getAllPositions();
            System.out.println(al);
           for(int  a:al)
               jcbPosition.addItem(a+"");
        } catch (SQLException ex) {
            Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPriority = new javax.swing.JTextField();
        jcbBusNo = new javax.swing.JComboBox<>();
        jcbRout = new javax.swing.JComboBox<>();
        jcbPosition = new javax.swing.JComboBox<>();
        jcbDriverName = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhishek maurya\\Desktop\\mini images\\BusIcon.PNG")); // NOI18N

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

        jLabel2.setText("Bus No.");

        jLabel3.setText("Bus Rout");

        jLabel4.setText("Position");

        jLabel5.setText("Driver Name");

        jLabel6.setText("Priority");

        jcbBusNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....." }));
        jcbBusNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbBusNoItemStateChanged(evt);
            }
        });

        jcbRout.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....." }));

        jcbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....." }));
        jcbPosition.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPositionItemStateChanged(evt);
            }
        });

        jcbDriverName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....." }));
        jcbDriverName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbDriverNameItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPriority, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jcbBusNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbRout, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbDriverName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUserName)
                        .addGap(214, 214, 214)
                        .addComponent(btnEnter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuit))
                    .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcbBusNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcbDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcbRout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEnter)
                        .addComponent(btnQuit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUserId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUserName)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        try {
            String pos=  jcbPosition.getSelectedItem().toString();
            String busno= jcbBusNo.getSelectedItem().toString();
            String drivername= jcbDriverName.getSelectedItem().toString();
            String priority=txtPriority.getText();
            String rout=jcbRout.getSelectedItem().toString();
            if(pos.equalsIgnoreCase(".....")||busno.equalsIgnoreCase(".....")||drivername.equalsIgnoreCase(".....")||rout.equalsIgnoreCase(".....")||priority.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "select all fields");
                return;
            }
            BusManagementPojo busManagementPojo= new BusManagementPojo(Integer.parseInt(pos),busno,drivername,Integer.parseInt(rout),Integer.parseInt(priority));
            BusManagementDao.add(busManagementPojo);
            JOptionPane.showMessageDialog(null, "Added");
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        BusArrangementOptionFrame busArrangementOptionFrame= new BusArrangementOptionFrame();
        busArrangementOptionFrame.setVisible(true);
        this.dispose();
       
       
        
      

    }//GEN-LAST:event_btnEnterActionPerformed

    private void jcbPositionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPositionItemStateChanged
      if(evt.getStateChange()==ItemEvent.DESELECTED) 
          return;
      
        try {
            jcbBusNo.removeAllItems();
            jcbBusNo.addItem(".....");
            ArrayList <String > al=BusDao.getAllBusNo();
            for(String no: al)
                 jcbBusNo.addItem(no);
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_jcbPositionItemStateChanged

    private void jcbBusNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbBusNoItemStateChanged
       if(evt.getStateChange()==ItemEvent.DESELECTED) 
          return;
      
        try {
            jcbDriverName.removeAllItems();
            jcbDriverName.addItem(".....");
            ArrayList <String > al=DriverDao.getAllDriver();
            
            for(String no: al)
                 jcbDriverName.addItem(no);
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jcbBusNoItemStateChanged

    private void jcbDriverNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbDriverNameItemStateChanged
        if(evt.getStateChange()==ItemEvent.DESELECTED) 
          return;
      
        try {
            jcbRout.removeAllItems();
            jcbRout.addItem(".....");
            ArrayList <Integer> al=RoutDao.getAllRout();
            
            
            for(int no: al)
                 jcbRout.addItem(no+"");
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbDriverNameItemStateChanged

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
            java.util.logging.Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusArrangementOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusArrangementOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbBusNo;
    private javax.swing.JComboBox<String> jcbDriverName;
    private javax.swing.JComboBox<String> jcbPosition;
    private javax.swing.JComboBox<String> jcbRout;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtPriority;
    // End of variables declaration//GEN-END:variables
}