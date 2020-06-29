<%-- 
    Document   : seestore
    Created on : 30 Jun, 2019, 10:34:20 PM
    Author     : bikrant bikram
--%>

<%@page import="shoppingcatalog.dto.OrderDTO"%>
<%@page import="shoppingcatalog.dao.OrderDAO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shoppingcatalog.dto.ItemDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>My orders</title>
        
        <link rel="stylesheet" type="text/css" href="styles/stylesheet.css">
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="jsscripts/jquery.js"></script>
        <script type="text/javascript" src="jsscripts/orderdetails.js"></script>
        
        
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
     StringBuffer d=new StringBuffer("<h1>Order Details</h1>");
            ArrayList<OrderDTO> al=OrderDAO.getOrder((String)session.getAttribute("username"));
            d.append("<table class='table table-striped'><tr><th>Orderid</th><th>amount</th><th>date</th></tr>");
            for(OrderDTO order:al)
            {
                d.append("<tr onclick=doTask('"+order.getOrderid()+"')><td >"+order.getOrderid()+"</td><td>"+order.getAnount()+"</td><td>"+order.getDate()+"</td></tr>");
              
            }
            d.append("</table>");
            out.println(d);
        %>
        
        
    </body>
</html>
