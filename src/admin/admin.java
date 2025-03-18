/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.config;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import lariosa_gui.login;

/**
 *
 * @author Administrator
 */
public class admin extends javax.swing.JFrame {

   config connect = new config();
   

    public admin() {
         
         initComponents();
        
        
    }
    
    
 

    public admin(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Help = new javax.swing.JPanel();
        Profile = new javax.swing.JPanel();
        Settings = new javax.swing.JPanel();
        Report = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        User = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bpanel = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setForeground(new java.awt.Color(204, 204, 204));
        background.setMaximumSize(new java.awt.Dimension(800, 400));
        background.setMinimumSize(new java.awt.Dimension(800, 400));
        background.setPreferredSize(new java.awt.Dimension(800, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL RENTAL ");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOTAL USERS ");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL CLOTHES ");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 160, 90));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        background.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 90));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        background.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 160, 90));

        Help.setBackground(new java.awt.Color(51, 51, 51));
        Help.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HelpMouseExited(evt);
            }
        });
        background.add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, 30));

        Profile.setBackground(new java.awt.Color(51, 51, 51));
        Profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfileMouseExited(evt);
            }
        });
        background.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, 30));

        Settings.setBackground(new java.awt.Color(51, 51, 51));
        Settings.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsMouseExited(evt);
            }
        });
        background.add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        Report.setBackground(new java.awt.Color(51, 51, 51));
        Report.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportMouseExited(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        Report.add(jLabel6);

        background.add(Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, 30));

        User.setBackground(new java.awt.Color(51, 51, 51));
        User.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserMouseExited(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        User.add(jLabel5);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Add User");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        User.add(jLabel11);

        background.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 30));

        dashboard.setBackground(new java.awt.Color(102, 102, 102));
        dashboard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-24.png"))); // NOI18N
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        dashboard.add(jLabel10);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        dashboard.add(jLabel3);

        background.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 30));

        bpanel.setBackground(new java.awt.Color(51, 51, 51));
        bpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setText(" ");
        bpanel.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 50));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-users-30.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        bpanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        Logout.setBackground(new java.awt.Color(51, 51, 51));
        Logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-24.png"))); // NOI18N
        Logout.add(jLabel19);

        bpanel.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 30, 40));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Logout");
        bpanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        background.add(bpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 410));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel9.setText("EXIT");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-24.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        background.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseEntered
        Help.setOpaque(true);
        Help.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_HelpMouseEntered

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
        Help.setOpaque(true);
        Help.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_HelpMouseExited

    private void ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseEntered
        Profile.setOpaque(true);
        Profile.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_ProfileMouseEntered

    private void ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseExited
        Profile.setOpaque(true);
        Profile.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_ProfileMouseExited

    private void SettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseEntered
        Settings.setOpaque(true);
        Settings.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_SettingsMouseEntered

    private void SettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseExited
        Settings.setOpaque(true);
        Settings.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_SettingsMouseExited

    private void ReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseEntered
        Report.setOpaque(true);
        Report.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_ReportMouseEntered

    private void ReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseExited
        Report.setOpaque(true);
        Report.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_ReportMouseExited

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked

        new admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardMouseClicked

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
       
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
       
    }//GEN-LAST:event_dashboardMouseExited

    private void UserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseEntered
      User.setOpaque(true);
        User.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_UserMouseEntered

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        new adminadduser().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_UserMouseClicked

    private void UserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseExited
        User.setOpaque(true);
        User.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_UserMouseExited

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Select", JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            login log = new login ();
            log.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        Logout.setOpaque(true);
        Logout.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        Logout.setOpaque(true);
        Logout.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_LogoutMouseExited

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit?","Select", JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);}
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exit.setOpaque(true);
        Exit.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setOpaque(true);
        Exit.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_ExitMouseExited

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Help;
    private javax.swing.JPanel Logout;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Report;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel User;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bpanel;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
