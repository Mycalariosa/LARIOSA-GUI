/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supadmin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import config.config;
import javax.swing.table.DefaultTableModel;


public class addaccount extends javax.swing.JFrame {
    config connect = new config(); // Ensure your `config` class manages DB connection
   
   
    public addaccount() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contactff = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        userff = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addaccount = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        lname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(contactff, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 205, 30));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 205, 30));
        getContentPane().add(userff, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 205, 30));

        jLabel5.setText("contact");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 60, 19));
        getContentPane().add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 206, 30));

        jLabel9.setText("email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 60, 19));

        jLabel2.setText("firstname");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jLabel10.setText("password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 60, 19));

        jLabel3.setText("lastname");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 60, 19));

        jLabel11.setText("username");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 60, 19));

        addaccount.setBackground(new java.awt.Color(0, 102, 153));
        addaccount.setText("Add Account");
        addaccount.setActionCommand("");
        addaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addaccountActionPerformed(evt);
            }
        });
        getContentPane().add(addaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 139, 36));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 205, 31));
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 205, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addaccountActionPerformed
    
        String firstname = fname1.getText().trim();
        String lastname = lname.getText().trim();
        String email1 = email.getText().trim();
        String contact = contactff.getText().trim();
        String username = userff.getText().trim();
        String password = new String(pass.getPassword()).trim();
        String status = "Pending";
        String role = "User";

        // Field Validations
        if (firstname.isEmpty() || lastname.isEmpty() || email1.isEmpty() || contact.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!email1.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(this, "Invalid email format!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!contact.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Contact number must contain only numbers!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isUsernameTaken(username)) {
            JOptionPane.showMessageDialog(this, "Username is already taken!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

     
        // Insert into database
       String sql = "INSERT INTO user (fname, lname, email, contact, username, password, status, role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

try (PreparedStatement pst = connect.getConnection().prepareStatement(sql)) {
    pst.setString(1, firstname);
    pst.setString(2, lastname);
    pst.setString(3, email1);
    pst.setString(4, contact);
    pst.setString(5, username);
    pst.setString(6, password);
    pst.setString(7, status);
    pst.setString(8, role);
    pst.executeUpdate();

    JOptionPane.showMessageDialog(this, "Account successfully added!", "Success", JOptionPane.INFORMATION_MESSAGE);

    // Redirect to SuperAdminDash
    superadmin adminDash = new superadmin();
    adminDash.setVisible(true);
    this.dispose(); // Close the add account form

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}}

    private boolean isUsernameTaken(String username) {
        String sql = "SELECT COUNT(*) FROM user WHERE username = ?";
        try (PreparedStatement pst = connect.getConnection().prepareStatement(sql)) {
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error while checking username!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    
    }//GEN-LAST:event_addaccountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       superadmin adminDash = new superadmin();
    adminDash.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  
     
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
            java.util.logging.Logger.getLogger(addaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addaccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addaccount;
    private javax.swing.JTextField contactff;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField userff;
    // End of variables declaration//GEN-END:variables
}
