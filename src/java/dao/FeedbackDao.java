/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Feedback;
import model.Vehicle;
import static travel.database.AppConnection.*;
/**
 *
 * @author Admin
 */
public class FeedbackDao {
     public boolean insertFeedback(Feedback feed) throws SQLException {
    String sql = "INSERT INTO Feedback(firstname,cnum,email,subject) values(?,?,?,?)";
    Connection con = checkConnection();
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setString(1, feed.getFirstname());
        statement.setString(2, feed.getCnum());
        statement.setString(3, feed.getEmail());
        statement.setString(4, feed.getSubject());

        return statement.executeUpdate() > 0;
    }
}
