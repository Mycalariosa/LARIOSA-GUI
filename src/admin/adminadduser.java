
package admin;

import config.config;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lariosa_gui.login;
import supadmin.superadmin;

public class adminadduser extends javax.swing.JFrame {

    config connect = new config();
    public adminadduser() {
        initComponents();
        loadUsers();
    
    }

  private void loadUsers() {
DefaultTableModel model = (DefaultTableModel) admintable.getModel();
model.setRowCount(0); // Clear existing rows
model.setColumnCount(0); // Clear existing columns

// Add all columns from your database table
model.addColumn("ID");
model.addColumn("First Name");
model.addColumn("Last Name");
model.addColumn("Email");
model.addColumn("Contact");
model.addColumn("Status");
model.addColumn("Role");

String query = "SELECT * FROM user";

try (ResultSet rs = connect.getData(query)) {
    if (rs == null) {
        System.err.println("Error: ResultSet is null. Check database connection.");
        return;
    }

    boolean hasData = false;
    while (rs.next()) {
        hasData = true;
        model.addRow(new Object[]{
            rs.getInt("u_id"),
            rs.getString("fname"),
            rs.getString("lname"),
            rs.getString("email"),
            rs.getString("contact"),
            rs.getString("status"),
            rs.getString("role")
        });
    }

    if (!hasData) {
        System.err.println("No data found in the database.");
    }

    model.fireTableDataChanged();

} catch (SQLException ex) {
    System.err.println("Error loading users: " + ex.getMessage());
}

  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        admintable = new javax.swing.JTable();
        seach = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        dashboard = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Profile = new javax.swing.JPanel();
        User = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        Report = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Help = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        contactff = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        userff = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        updateaccount = new javax.swing.JButton();
        Exit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addaccount1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setForeground(new java.awt.Color(204, 204, 204));
        background.setMaximumSize(new java.awt.Dimension(800, 400));
        background.setMinimumSize(new java.awt.Dimension(800, 400));
        background.setPreferredSize(new java.awt.Dimension(800, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admintable.setBackground(new java.awt.Color(204, 204, 204));
        admintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        admintable.setColumnSelectionAllowed(true);
        admintable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(admintable);
        admintable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 550, 180));

        seach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachActionPerformed(evt);
            }
        });
        background.add(seach, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 240, -1));

        jLabel2.setText("Search name :");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        background.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 70, 20));

        dashboard.setBackground(new java.awt.Color(51, 51, 51));
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

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-24.png"))); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        dashboard.add(jLabel15);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");
        dashboard.add(jLabel3);

        background.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 30));

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

        User.setBackground(new java.awt.Color(102, 102, 102));
        User.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Add User");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        User.add(jLabel14);

        background.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 30));

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

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-users-30.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Logout");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

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

        jPanel2.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 30, 40));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 410));
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        fname1.setEditable(false);
        fname1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        background.add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 180, 20));

        jLabel8.setText("firstname");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel9.setText("lastname");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 60, 19));
        background.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 180, 20));

        jLabel10.setText("email");
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 60, 19));
        background.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 180, 20));
        background.add(contactff, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 200, 20));

        jLabel11.setText("contact");
        background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 60, 19));

        jLabel12.setText("username");
        background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 60, 19));
        background.add(userff, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 200, 20));

        jLabel13.setText("password");
        background.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 60, 19));
        background.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 200, 20));

        updateaccount.setBackground(new java.awt.Color(102, 102, 102));
        updateaccount.setText("Update");
        updateaccount.setActionCommand("");
        updateaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateaccountActionPerformed(evt);
            }
        });
        background.add(updateaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 80, 20));

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

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel7.setText("EXIT");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        addaccount1.setBackground(new java.awt.Color(102, 102, 102));
        addaccount1.setText("Add ");
        addaccount1.setActionCommand("");
        addaccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addaccount1ActionPerformed(evt);
            }
        });
        background.add(addaccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 70, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
          new admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardMouseClicked

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
     
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void seachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachActionPerformed
     
    }//GEN-LAST:event_seachActionPerformed

    private void updateaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateaccountActionPerformed
 DefaultTableModel model = (DefaultTableModel) admintable.getModel();
    int rowCount = model.getRowCount();
    int rowsUpdated = 0;

    for (int i = 0; i < rowCount; i++) {
        int userId = Integer.parseInt(model.getValueAt(i, 0).toString());
        String firstName = model.getValueAt(i, 1).toString();
        String lastName = model.getValueAt(i, 2).toString();
        String email = model.getValueAt(i, 3).toString();
        String contact = model.getValueAt(i, 4).toString();
        String status = model.getValueAt(i, 5).toString();
        String role = model.getValueAt(i, 6).toString();

        // Optional: Check if this row is really changed (extra logic if you want)
        String checkQuery = "SELECT fname, lname, email, contact, status, role FROM user WHERE u_id = ?";
        boolean hasChanged = false;

        try (PreparedStatement checkStmt = connect.getConnection().prepareStatement(checkQuery)) {
            checkStmt.setInt(1, userId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                if (!firstName.equals(rs.getString("fname")) ||
                    !lastName.equals(rs.getString("lname")) ||
                    !email.equals(rs.getString("email")) ||
                    !contact.equals(rs.getString("contact")) ||
                    !status.equals(rs.getString("status")) ||
                    !role.equals(rs.getString("role"))) {
                    hasChanged = true;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error checking existing data for user ID " + userId + ": " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }

        if (hasChanged) {
            String updateQuery = "UPDATE user SET fname=?, lname=?, email=?, contact=?, status=?, role=? WHERE u_id=?";

            try (PreparedStatement pst = connect.getConnection().prepareStatement(updateQuery)) {
                pst.setString(1, firstName);
                pst.setString(2, lastName);
                pst.setString(3, email);
                pst.setString(4, contact);
                pst.setString(5, status);
                pst.setString(6, role);
                pst.setInt(7, userId);

                int updated = pst.executeUpdate();
                if (updated > 0) {
                    rowsUpdated++;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error updating user ID " + userId + ": " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(this, "User records updated successfully!");
        loadUsers();
    

    }//GEN-LAST:event_updateaccountActionPerformed
    }
    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
            dashboard.setOpaque(true);
    dashboard.setBackground(new java.awt.Color(102,102,102)); 
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setOpaque(true);
    dashboard.setBackground(new java.awt.Color(51,51,51)); 
    }//GEN-LAST:event_dashboardMouseExited

    private void ReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseEntered
     Report.setOpaque(true);
    Report.setBackground(new java.awt.Color(102,102,102)); 
    }//GEN-LAST:event_ReportMouseEntered

    private void ReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseExited
       Report.setOpaque(true);
    Report.setBackground(new java.awt.Color(51,51,51)); 
    }//GEN-LAST:event_ReportMouseExited

    private void SettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseExited
       Settings.setOpaque(true);
    Settings.setBackground(new java.awt.Color(51,51,51)); 
    }//GEN-LAST:event_SettingsMouseExited

    private void SettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseEntered
        Settings.setOpaque(true);
    Settings.setBackground(new java.awt.Color(102,102,102)); 
    }//GEN-LAST:event_SettingsMouseEntered

    private void ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseEntered
      Profile.setOpaque(true);
    Profile.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_ProfileMouseEntered

    private void ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseExited
       Profile.setOpaque(true);
    Profile.setBackground(new java.awt.Color(51,51,51)); 
    }//GEN-LAST:event_ProfileMouseExited

    private void HelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseEntered
        Help.setOpaque(true);
    Help.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_HelpMouseEntered

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
     Help.setOpaque(true);
    Help.setBackground(new java.awt.Color(51,51,51)); 
    }//GEN-LAST:event_HelpMouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
         Logout.setOpaque(true);
    Logout.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
      Logout.setOpaque(true);
      Logout.setBackground(new java.awt.Color(51,51,51)); 
    }//GEN-LAST:event_LogoutMouseExited

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

    private void addaccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addaccount1ActionPerformed
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
            adminadduser adminadd = new adminadduser();
            adminadd.setVisible(true);
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

         
    }//GEN-LAST:event_addaccount1ActionPerformed

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
            java.util.logging.Logger.getLogger(adminadduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminadduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminadduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminadduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminadduser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Help;
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Report;
    private javax.swing.JButton SearchButton;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel User;
    private javax.swing.JButton addaccount1;
    private javax.swing.JTable admintable;
    private javax.swing.JPanel background;
    private javax.swing.JTextField contactff;
    private javax.swing.JPanel dashboard;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField seach;
    private javax.swing.JButton updateaccount;
    private javax.swing.JTextField userff;
    // End of variables declaration//GEN-END:variables
}
