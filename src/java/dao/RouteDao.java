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
import model.Route;
import model.Vehicle;
import static travel.database.AppConnection.*;

/**
 *
 * @author Admin
 */
public class RouteDao {

    public boolean insertRoute(Route route) throws SQLException {
        String sql = "INSERT INTO ROUTE (routefrom,routeto,vehiclenum,vehicletype,dateoftravel) values (?,?,?,?,?)";
        Connection con = checkConnection();
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setString(1, route.getRoutefrom());
        statement.setString(2, route.getRouteto());
        statement.setString(3, route.getVehiclenum());
        statement.setString(4, route.getVehicletype());
        statement.setString(5, route.getDateoftravel());

        return statement.executeUpdate() > 0;
    }

    public boolean deleteRouteById(int id) throws SQLException {
        {
            String sql = "DELETE From ROUTE where ID = ?";

            Connection con = checkConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);

            return statement.executeUpdate() > 0;
        }
    }    
    

    public List<Route> getAllRoute() {
        List<Route> routes = new ArrayList<>();

        String sql = "Select * from route";

        try {
            Connection connection = checkConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                routes.add(new Route(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)));

                System.out.println("Route Data : " + routes.toString());
            }
        } catch (SQLException e) {
            System.err.println("Error Occured : " + e.getMessage());
            e.printStackTrace();
        }

        return routes;
    }

}
