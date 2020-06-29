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
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
    String str = sdf.format(today);
    out.println("<h3>Current date at server is " + str + "</h3>");
%>