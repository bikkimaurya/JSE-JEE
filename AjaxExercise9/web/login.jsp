<%-- 
    Document   : login
    Created on : 24 Jun, 2019, 8:37:50 AM
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
    
    PreparedStatement ps = conn.prepareStatement("select * from allusers where userid = ? and password = ?");
    ps.setString(1,request.getParameter("userid"));
    ps.setString(2, request.getParameter("password"));
    
    ResultSet rs = ps.executeQuery();
    if(rs.next())
    {
        out.println("Login Successful");
    }
    else
        out.println("Ivalid userid or password");
    try
    {
        conn.close();
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
%>
