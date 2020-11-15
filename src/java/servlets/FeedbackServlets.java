/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import dao.FeedbackDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Feedback;
/**
 *
 * @author Admin
 */
public class FeedbackServlets extends HttpServlet{
    private FeedbackDao dao = new FeedbackDao();
    private Feedback feed = new Feedback();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ///super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    doGet(req, resp);
    
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    try {
         
            feed.setFirstname(req.getParameter("firstname"));
            feed.setCnum(req.getParameter("cnum"));
            feed.setEmail(req.getParameter("email"));
            feed.setSubject(req.getParameter("subject"));
            
            dao.insertFeedback(feed);
            
            RequestDispatcher dispatcher = req.getRequestDispatcher("feedback.jsp");
            dispatcher.forward(req, resp);
    }
    catch (SQLException ex) {
            //Logger.getLogger(FeedbackServlets.class.getFirstname()).log(Level.SEVERE, null, ex);
        }    
        
    }
}

