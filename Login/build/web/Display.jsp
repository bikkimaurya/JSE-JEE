<%-- 
    Document   : Display
    Created on : 30 Apr, 2019, 5:21:27 PM
    Author     : bikrant bikram
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Display</title>
    </head>
    <body>
       price:<%
       java.util.ArrayList<String> al=(java.util.ArrayList)request.getAttribute("al");
       out.print(al);
       %>
    </bodxy>
</html>
