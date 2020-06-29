<%-- 
    Document   : home
    Created on : 22 Jun, 2019, 10:20:23 AM
    Author     : $HUBH_AM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajax Exercise 6</title>
        <script>
            ajaxreq = new XMLHttpRequest();

            function show()
            {
                ajaxreq.onreadystatechange = processresponse;
                var empno = document.getElementById("empid").value;
                ajaxreq.open("GET" ,"showdetails.jsp?eno=" + empno,true );
                ajaxreq.send(null);
            }
            
            function processresponse()
            {
                if(ajaxreq.readyState === 4)
                {
                    var edetails = document.getElementById("result");
                    edetails.innerHTML = ajaxreq.responseText;
                }
            }
        </script>
    </head>
    <body bgcolor="#fff8888">
    <center>
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

            PreparedStatement ps = conn.prepareStatement("select empno from emp");
            ResultSet rs = ps.executeQuery();
            out.println("<b>Select employee id : </b><select id='empid' onchange='show()'>");
            while(rs.next())
            {
                int empid = rs.getInt(1);
                out.println("<option value=" + empid + ">" + empid + "</option>");
            }
            try
            {
                conn.close();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        %>
        </select>
        <div id="result"></div>
    </center>
    </body>
</html>
