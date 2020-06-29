<%-- 
    Document   : seestore
    Created on : 30 Jun, 2019, 10:34:20 PM
    Author     : bikrant bikram
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="shoppingcatalog.dto.ItemDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
   
        </div>
        <%
             if(session.getAttribute("username")==null)
            {
                response.sendRedirect("accessDenied.html");
            }
    StringBuffer d=new StringBuffer("");
    d.append("<h4 id='logout'><a href='myorder.jsp'>My orders</a>&nbsp;&nbsp;&nbsp<a href=LoginControllerServlet?logout=logout>Logout</a><h4>");
    ArrayList<String> al=(ArrayList<String>)request.getAttribute("al");
    for(String a:al)
    {
          d.append("<h3  id='"+a+"'onclick=doTask('"+a+"')>+"+a+"</h3> <br>");
    }
    out.println(d);
        %>
        
        
    </body>
</html>
