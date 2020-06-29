<%-- 
    Document   : getdate
    Created on : 21 Jun, 2019, 10:32:46 AM
    Author     : $HUBH_AM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.* , java.text.*" %>
<%
    response.setDateHeader("Expires", -1);
    Date today = new Date();
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
    String str1 = sdf1.format(today);
    SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
    String str2 = sdf2.format(today);
    out.println("<h3>Current date at server is " + str1 + "</h3>");
    out.println("<h3 id='time'>Current time at server is " + str2 + "</h3>");
%>