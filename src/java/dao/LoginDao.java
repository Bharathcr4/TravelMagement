/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static travel.database.AppConnection.*;

/**
 *
 * @author Admin
 */
public class LoginDao {
    private boolean status = false;

    public boolean validate(String user, String pass) {
        Connection con = checkConnection();
        try {
            PreparedStatement ps = con.prepareStatement(
                    "select * from User where email=? and password=?");
            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (Exception e){
                System.out.println(e);
        }
        return status;
    }
}
