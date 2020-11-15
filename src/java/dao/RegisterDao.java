/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.User;
import static travel.database.AppConnection.*;

/**
 *
 * @author Admin
 */
public class RegisterDao {

    public boolean insertUser(User user) throws SQLException {
        String sql = "INSERT INTO USER (name,email,password) values (?,?,?)";
        Connection con = checkConnection();
        PreparedStatement statement = con.prepareStatement(sql);
        
        statement.setString(1, user.getName());
        statement.setString(2, user.getEmail());
        statement.setString(3, user.getPassword());
        

        return statement.executeUpdate() > 0;
    }
}
