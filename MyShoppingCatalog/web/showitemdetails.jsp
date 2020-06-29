

<%@page import="shoppingcatalog.dto.ItemInfoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shoppingcatalog.dto.ItemDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home page</title>
        <link rel="stylesheet" type="text/css" href="styles/stylesheet.css">
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="jsscripts/storecontroller.js"></script>
        <script type="text/javascript" src="jsscripts/jquery.js"></script>
        
        
    </head>
    <body>
        <div id ="logo">
            <img src="images/shopping_logo5.png">
            
            <br>
            
   
        </div>
       
        <%
             if(session.getAttribute("username")==null)
            {
                response.sendRedirect("accessDenied.html");
            }
           StringBuffer d=new StringBuffer("<h1>My Store item Details</h1><p><em>you are viewing:</em><br>");
           
            ItemDTO item=(ItemDTO)request.getAttribute("item");
            d.append("<strong><a href='StoreControllerServlet'>"+item.getItemType()+"</a>"+item.getItemName()+"</strong></a>");
            d.append("<div style='float:left'><img src=\'images/"+item.getItemImage()+"'></div>"+"<div style='float:left;padding:left:12px'>");
            d.append("<p><strong>Description:</strong><br>"+item.getItemDesc()+"</p><p><strong>Price:</strong>"+item.getItemPrice());
            d.append("</p><a href='addtocart.jsp?itemid="+item.getItemId()+"'>Add to cart</a><br>");
            d.append("<h4 id='logout'><a href='myorder.jsp'>My orders</a>&nbsp;&nbsp;&nbsp<a href=LoginControllerServlet?logout=logout>Logout</a><h4>");
            out.println(d);


            %>
     
        
        
    </body>
</html>

