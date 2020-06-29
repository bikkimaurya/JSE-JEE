<%-- 
    Document   : seestore
    Created on : 30 Jun, 2019, 10:34:20 PM
    Author     : bikrant bikram
--%>

<%@page import="java.util.Enumeration"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shoppingcatalog.dto.ItemDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Place order</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="styles/stylesheet.css">
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="jsscripts/storecontroller.js"></script>
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
     StringBuffer d=new StringBuffer("<h1>Place Order</h1>");
            Enumeration e=session.getAttributeNames();
            int count =0;
            float price=0;
            d.append("<table class='table table-striped'><tr><th>Item id</th><th>Item Name</th><th>Item type</th><th>Price</th></tr>");
            while(e.hasMoreElements())
            {
                String key=(String)e.nextElement();
                if(!key.equalsIgnoreCase("username"))
                {
                 ItemDTO item= (ItemDTO)  session.getAttribute(key);
                 
                d.append("<tr><td>"+item.getItemId()+"</td><td>"+item.getItemName()+"</td><td>"+item.getItemType()+"</td><td>"+item.getItemPrice()+"</td></tr>");
              
                price= (float)item.getItemPrice()+price;
                }
                count++;
            }
            d.append("<strong>Items in the cart:</strong>"+(count-1)+"<br>");
            d.append("<strong>Total price:</strong>"+price);
            d.append("<a href='PlaceOrderServlet?price="+price+"'>Confirm</a>");
            

            d.append("<h4 id='logout'><a href='myorder.jsp'>My orders</a>&nbsp;&nbsp;&nbsp<a href=LoginControllerServlet?logout=logout>Logout</a><h4>");
            out.println(d);
        %>
        
        
    </body>
</html>
