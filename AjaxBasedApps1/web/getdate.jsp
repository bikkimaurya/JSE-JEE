<%@ page import="java.util.*,java.text.*" %>
<%
response.setDateHeader("Expires",-1);
Date today=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
String str=sdf.format(today);
out.println("<h3>Current Date at server is "+str+"</h3>");
%>
