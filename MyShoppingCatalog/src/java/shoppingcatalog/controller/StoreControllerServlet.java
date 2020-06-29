
package shoppingcatalog.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import shoppingcatalog.dao.StoreDAO;
import shoppingcatalog.dto.ItemDTO;
import shoppingcatalog.dto.ItemInfoDTO;

/**
 *
 * @author bikrant bikram
 */
public class StoreControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd=null;
        try {
            response.setContentType("text/html;charset=UTF-8");
            String itemtype=request.getParameter("itemtype");
            String itemid=request.getParameter("itemid");
            System.out.println(itemtype+itemid);
            if(request.getSession().getAttribute("username")==null)
            {
             rd=request.getRequestDispatcher("accessDenied.html");
            }
            else if(itemtype==null && itemid==null)
            {
            ArrayList <String> al=new ArrayList<>();
            al=StoreDAO.getItemTypes();
            request.setAttribute("al", al);
            rd=request.getRequestDispatcher("seestore.jsp"); 
            
            }
            else if(itemtype!=null && itemid==null)
            {
            ArrayList <ItemInfoDTO> al=new ArrayList<>();
            al=StoreDAO.getItemsByTypes(itemtype);
                System.out.println("in itemtype");
                System.out.println(al);
            request.setAttribute("al", al);
            rd=request.getRequestDispatcher("showitembytype.jsp"); 
            }
            else if(itemid!=null)
            {
           
            ItemDTO item=StoreDAO.getItemsInfo(itemid);
             request.setAttribute("item", item);
            rd=request.getRequestDispatcher("showitemdetails.jsp"); 
            }
            
        } catch (SQLException ex) {
           ex.printStackTrace();
           rd=request.getRequestDispatcher("showerror.jsp");
           
        }
        finally
        {
            rd.forward(request, response);
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
