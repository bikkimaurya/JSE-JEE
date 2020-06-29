<%-- 
    Document   : salary
    Created on : 22 Jun, 2019, 6:39:36 AM
    Author     : $HUBH_AM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    
    PreparedStatement ps = conn.prepareStatement("select sal from emp where ename = ?");
    ps.setString(1, request.getParameter("ename"));
    ResultSet rs = ps.executeQuery();
    if(rs.next())
        out.println("Salary is : " + rs.getInt(1));
    else
        out.println("No result found in the DB");
    try
    {
        conn.close();
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
%>
