
package config;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class config {
     private Connection connect;
     
    public config(){
       
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/lariosa_gui", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
   
        public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }

         public Connection getConnection(){
        return connect;
    }
}
