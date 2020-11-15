/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class AppConnection {
    
    public static Connection checkConnection(){
        Connection connection = null;
        
        try {
             Class.forName("org.sqlite.JDBC");
            String dbUrl = "jdbc:sqlite:e:\\Travel.db";
            // create a connection to the database  
            connection = DriverManager.getConnection(dbUrl);
            System.out.println("Connection to SQLite has been established.");
        }catch (Exception e) {
            System.out.println(e.getMessage());  
        }
        
        return connection;
    }
    
}
