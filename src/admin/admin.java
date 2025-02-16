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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class admin extends javax.swing.JFrame {

    private JTable admintable;
    config connect = new config();

   

    public admin() {
         loadUsers();
         initComponents();
        
    }

    private void loadUsers() {

        
if (admintable == null) { // Check if admintable is initialized
            System.err.println("admintable is not initialized!");
            return;
        }

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("User ID");
        model.addColumn("First Name");
        model.addColumn("Last Name");
        model.addColumn("Contact Number");
        model.addColumn("Email");
        model.addColumn("Username");
        model.addColumn("Status");

        String query = "SELECT u_id, fname, lname, contact, email, username, status FROM user";

        try (ResultSet rs = connect.getData(query)) {
            if (rs != null) {
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getInt("u_id"),
                        rs.getString("fname"),
                        rs.getString("lname"),
                        rs.getString("contact"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("status")
                    });
                }
            }
            admintable.setModel(model); // Ensure admintable is initialized before this line
            model.fireTableDataChanged(); // Refresh table
        } catch (SQLException ex) {
            System.err.println("Error loading users: " + ex.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        admintab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(153, 153, 153));
        background.setMinimumSize(new java.awt.Dimension(800, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admintab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        admintab.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(admintab);
        admintab.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 560, 330));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable admintab;
    private javax.swing.JPanel background;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
