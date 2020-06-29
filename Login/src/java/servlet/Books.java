/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servletdao.BookDao;

/**
 *
 * @author bikrant bikram
 */
@WebServlet(name = "Books", urlPatterns = {"/Books"})
public class Books extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter pw = null;
        try {
            res.setContentType("text/html;charset=UTF-8");
            
            pw= res.getWriter();
            String bname= req.getParameter("bname");
            ServletContext sc=  super.getServletContext();
              Exception ex=( Exception)sc.getAttribute("exception");
              if(ex!=null)throw new ServletException();              
            Connection conn=(Connection)sc.getAttribute("connector");
          
            if(conn==null)throw new ServletException();
            
            
ArrayList <String > al=BookDao.bookByName(conn, bname);

//            
//            pw.println("<html>");
//            pw.println("<head>");
//            pw.println("<title>");
//            pw.println("</title>");
////            pw.println("<style");
////            pw.println("table{ color = red;}");
////            pw.println("</style>");
////   
////            
//            pw.println("</head>");
//            pw.println("<body>");
            if(!al.isEmpty())
            {
           req.setAttribute("al",al);

 RequestDispatcher rd= req.getRequestDispatcher("Display.jsp");
  pw.println(al);
 if(rd==null)pw.println("NO book founnnnnnnnnnnnnnnnnnnnnnnnnnnnnt of this name");

 else rd.include(req, res);
            
            }
            else{
                sc.setAttribute("bname",bname);
               
                RequestDispatcher rd= req.getRequestDispatcher("NoBook.jsp");
 if(rd==null)pw.println("NO book founnnnnnnnnnnnnnnnnnnnnnnnnnnnnt of this name");
 else rd.include(req, res);
            }
            
            
//            else pw.println("NO book fount of this name");
//            pw.println("</body>");
//            pw.println("</html>");
//            
            
        } catch (SQLException ex) {
            RequestDispatcher rd= req.getRequestDispatcher("ErrorPrinter.jsp");
 if(rd==null)pw.println("NO book founnnnnnnnnnnnnnnnnnnnnnnnnnnnnt of this name");
 else rd.include(req, res);
        }
       
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
