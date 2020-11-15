/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class LoginServlets extends HttpServlet{
    
    private LoginDao loginDao = new LoginDao();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        
        resp.setContentType("text/html");
        
        PrintWriter out = resp.getWriter();
        
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        if (loginDao.validate(username, password)) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("customerhomepage.jsp");
            dispatcher.forward(req, resp);
        } else {
            out.println("Wrong Username and Password !");
            RequestDispatcher dispatcher = req.getRequestDispatcher("customerlogin.jsp");
            dispatcher.include(req, resp);
        }
        
        out.close();
    }
}