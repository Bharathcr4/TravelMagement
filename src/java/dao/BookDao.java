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
import model.Book;
import model.Vehicle;
import static travel.database.AppConnection.*;

/**
 *
 * @author Admin
 */
public class BookDao {

    public boolean insertBook(Book book) throws SQLException {
        String sql = "INSERT INTO Booking (name,phonenum,routefrom,routeto,vehiclenum,dateoftravel,pickuppoint) values (?,?,?,?,?,?,?)";
        Connection con = checkConnection();
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setString(1, book.getName());
        statement.setString(2, book.getPhonenum());
        statement.setString(3, book.getRoutefrom());
        statement.setString(4, book.getRouteto());
        statement.setString(5, book.getVehiclenum());
        statement.setString(6, book.getDateoftravel());
        statement.setString(7, book.getPickuppoint());

        return statement.executeUpdate() > 0;
    }

    public boolean CancelBookById(int id) throws SQLException{
        String sql = "DELETE  From Booking where ID = ?";
        
            Connection con = checkConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            
       return statement.executeUpdate() > 0;
    }

    public List<Book> getAllBook() {
        List<Book> books = new ArrayList<>();

        String sql = "Select * from Booking";

        try {
            Connection connection = checkConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                books.add(new Book(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)));

                System.out.println("Book Data : " + books.toString());
            }
        } catch (SQLException e) {
            System.err.println("Error Occured : " + e.getMessage());
            e.printStackTrace();
        }

        return books;

    }

}