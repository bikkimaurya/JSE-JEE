<%-- 
    Document   : sum
    Created on : 21 Jun, 2019, 10:40:57 AM
    Author     : $HUBH_AM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    response.setDateHeader("Expires", -1);
    int a = Integer.parseInt(request.getParameter("firstnum"));
    int b = Integer.parseInt(request.getParameter("secnum"));
    int c = a+b;
    out.println("Sum is " + c);
%>
