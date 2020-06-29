<%-- 
    Document   : showdetails
    Created on : 22 Jun, 2019, 9:54:15 AM
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
    
    PreparedStatement ps = conn.prepareStatement("select ename , sal , job , deptno from emp where empno=?");
    ps.setString(1, request.getParameter("eno"));
    ResultSet rs = ps.executeQuery();
    if(rs.next())
    {
        String ename = rs.getString(1);
        double sal = rs.getDouble(2);
        String job = rs.getString(3);
        int deptno = rs.getInt(4);
        out.println("<table border='2' style='margin-top:20px'>");
        out.println("<tr><th>Empname</th><td>" + ename + "</td></tr>");
        out.println("<tr><th>Salary</th><td>" + sal + "</td></tr>");
        out.println("<tr><th>Job</th><td>" + job + "</td></tr>");
        out.println("<tr><th>DeptNo</th><td>" + deptno + "</td></tr>");
        out.println("</table>");
    }
    else
        out.println("No reccord found");
    try
    {
        conn.close();
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
%>
