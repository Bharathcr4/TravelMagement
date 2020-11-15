/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.BookDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Book;

/**
 *
 * @author Admin
 */
/**
 *
 * @author Admin
 */
public class BookServlets extends HttpServlet {

    private BookDao dao = new BookDao();
    private Book book;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ///super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
            book = new Book(0,
                    req.getParameter("name"),
                    req.getParameter("phonenum"),
                    req.getParameter("routefrom"),
                    req.getParameter("routeto"),
                    req.getParameter("vehiclenum"),
                    req.getParameter("dateoftravel"),
                    req.getParameter("pickuppoint"));

            dao.insertBook(book);
            {
                System.out.println("Booking is  successfull.... ");
                RequestDispatcher dispatcher = req.getRequestDispatcher("book.jsp");
                dispatcher.forward(req, resp);
            }

        } catch (SQLException e) {
            //Logger.getLogger(RouteServlet.class.getRoutefrom()).log(Level.SEVERE, null, ex);
        }
    }
}
