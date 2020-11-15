/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.RouteDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Route;

/**
 *
 * @author Admin
 */
public class RouteServlet extends HttpServlet{
     private RouteDao dao = new RouteDao();
    private Route route;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try {
            //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
            
            route = new Route(0,
                    req.getParameter("routefrom"),
                    req.getParameter("routeto"),
                    req.getParameter("vehiclenum"),
                    req.getParameter("vehicletype"),
                    req.getParameter("dateoftravel"));
            
            //route.setRoutefrom(req.getParameter("routefrom"));
            //route.setRouteto(req.getParameter("routeto"));
            //route.setVehiclenum(req.getParameter("vehiclenum"));
            //route.setVehicletype(req.getParameter("vehicletype"));
            //route.setDateoftravel(req.getParameter("dateoftravel"));
       
             dao.insertRoute(route);
            {
                System.out.println("Routes are added successfully.... ");
            RequestDispatcher dispatcher = req.getRequestDispatcher("addroute.jsp");
            dispatcher.forward(req, resp); 
              }
          
        }catch (SQLException e) {
            //Logger.getLogger(RouteServlet.class.getRoutefrom()).log(Level.SEVERE, null, ex);
                 }
        }
    }