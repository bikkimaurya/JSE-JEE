<%-- 
    Document   : registration
    Created on : 24 Jun, 2019, 6:58:58 AM
    Author     : $HUBH_AM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<%
  response.setDateHeader("Expires", -1);
  Connection conn = null;  
    try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//career2018:1521/xe" , "advancejava" , "advancejava");
        }
        catch(Exception e)
        {
            System.out.println("Some error in connecting DB");
            e.printStackTrace();
        }
    if(conn == null)
    {
        out.println("Server is experiencing some issue! try again later");
        return;
    }
    
    PreparedStatement ps = conn.prepareStatement("insert  into allusers values(? , ? , ?)");
    ps.setString(1, request.getParameter("username"));
    ps.setString(2,request.getParameter("userid"));
    ps.setString(3, request.getParameter("password"));
    
    if(ps.executeUpdate() == 1)
        out.println("<h4>Welcome " + request.getParameter("username") + "</h4>");
    else
        out.println("Registration not done . Please try again later");
    try
    {
        conn.close();
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
%>