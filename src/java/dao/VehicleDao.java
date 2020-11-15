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
import model.Vehicle;
import static travel.database.AppConnection.*;
/**
 *
 * @author Admin
 */
public class VehicleDao {
    
    public boolean insertVehicle(Vehicle vehicle) throws SQLException {
        String sql = "INSERT INTO VEHICLE (vehiclename,vehiclenum,drivername,phonenumber) values (?,?,?,?)";
        Connection con = checkConnection();
        PreparedStatement statement = con.prepareStatement(sql);
        
         statement.setString(1, vehicle.getVehiclename());
         statement.setString(2, vehicle.getVehiclenum());
         statement.setString(3, vehicle.getDrivername());
          statement.setString(4, vehicle.getPhonenumber());
      
          return statement.executeUpdate() > 0;
    }
    
    public List<Vehicle> getAllVehicle(){
        List<Vehicle> vehicles = new ArrayList<>();
        
        String sql = "Select * from vehicle";
        
        try {
            Connection connection = checkConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                vehicles.add(new Vehicle(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)));
                
                System.out.println("Data : " + vehicles.toString());
        }
        } catch (SQLException e) {
            System.err.println("Error Occured : " + e.getMessage());
            e.printStackTrace();
        }
        return vehicles;
    }
}
