/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.RegisterDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author Admin
 */
public class RegisterServlet extends HttpServlet{
    private RegisterDao dao = new RegisterDao();
    private User user = new User();
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ////super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try {
            //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
            
            user.setEmail(req.getParameter("email"));
            user.setPassword(req.getParameter("password"));
            user.setName(req.getParameter("uname"));
            
            dao.insertUser(user);
            
            RequestDispatcher dispatcher = req.getRequestDispatcher("customerlogin.jsp");
            dispatcher.forward(req, resp);
        } 
        catch (SQLException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
    }
    
    
    
}
