/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.VehicleDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Vehicle;

/**
 *
 * @author Admin
 */
public class VehicleServlet extends HttpServlet {

    private VehicleDao dao = new VehicleDao();
    private Vehicle vehicle;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
        // super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
            vehicle = new Vehicle(0, req.getParameter("vehiclename"),
                    req.getParameter("vehiclenum"),
                    req.getParameter("drivername"),
                    req.getParameter("phonenumber"));
            
            //vehicle.setVehiclename(req.getParameter("vehiclename"));
            //vehicle.setVehiclenum(req.getParameter("vehiclenum"));
            //vehicle.setDrivername(req.getParameter("drivername"));
            //vehicle.setPhonenumber(req.getParameter("phonenumber"));

            dao.insertVehicle(vehicle);
            

            RequestDispatcher dispatcher = req.getRequestDispatcher("Addvehicle.jsp");
            dispatcher.forward(req, resp);
            System.out.println("Vehicles are added successfully.... ");
        } catch (SQLException e) {
            //Logger.getLogger(RouteServlet.class.getRoutefrom()).log(Level.SEVERE, null, ex);
        }
    }
}
