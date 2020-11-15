/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.RouteDao;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class DeleteServlets extends HttpServlet {
    private RouteDao routeDao = new RouteDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    try {
            int id = Integer.parseInt(req.getParameter("id"));
              System.out.println("id is :"+id);
              routeDao.deleteRouteById(id);
          RequestDispatcher dispatcher = req.getRequestDispatcher("delroute.jsp");
            dispatcher.forward(req, resp);
        } catch (SQLException e) {
            System.err.println("Error Occured : " + e.getMessage());
        }
    }
    
    
    
}
