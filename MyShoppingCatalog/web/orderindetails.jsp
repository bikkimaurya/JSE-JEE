<%-- 
    Document   : addtocart
    Created on : 2 Jul, 2019, 10:43:26 AM
    Author     : bikrant bikram
--%>

<%@page import="shoppingcatalog.dto.OrderDetailsDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shoppingcatalog.dao.OrderDAO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="shoppingcatalog.dao.StoreDAO"%>
<%@page import="shoppingcatalog.dto.ItemDTO"%>
<%@page   errorPage="showerror.jsp" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add to cart</title>
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" type="text/css" href="styles/stylesheet.css">
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
       
        <script type="text/javascript" src="jsscripts/jquery.js"></script>
        
    </head>
    <body>
        <div id ="logo">
            <img src="images/shopping_logo5.png">
        
   
        </div>
        <%
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("accessDenied.html");
            }
            StringBuffer d=new StringBuffer("<h1>Order details</h1>");
            int count=0;
            String id=request.getParameter("orderid");
            ArrayList<OrderDetailsDTO> al =OrderDAO.getOrderDetails(id);
            d.append("<table class='table table-striped'><tr><th>Item name</th><th>Price</th></tr>");
            for(OrderDetailsDTO order:al)
                d.append("<tr><td>"+order.getItemname()+"</td><td>"+order.getPrice()+"</td></tr>");
            d.append("</table>");
                       
                        
            d.append("<a href='StoreControllerServlet'>countinue shopping</a>");
            d.append("<h4 id='logout'><a href='myorder.jsp'>My orders</a>&nbsp;&nbsp;&nbsp<a href=LoginControllerServlet?logout=logout>Logout</a><h4>");
            out.println(d);
           
            
             


            
          %>
          
    </body>
</html>
