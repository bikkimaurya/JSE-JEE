<%-- 
    Document   : loginresponse
    Created on : 27 Jun, 2019, 11:31:35 AM
    Author     : bikrant bikram
--%>

<%@page import="shoppingcatalog.dto.UserDTO"%>
<%@page errorPage="showerror.jsp" contentType="text/html" pageEncoding="UTF-8"%>

<%
            UserDTO user=(UserDTO)request.getAttribute("user");
            String username=user.getUsername();
            String type=user.getUsertype();
           
           
            System.out.println("usernem jsp "+username);
            boolean v=(boolean)request.getAttribute("result");
            if(v==true)
            {
                
                if(type.equalsIgnoreCase("CUSTOMER"))
                {
                  String url="StoreControllerServlet;jsessionid="+session.getId();
                  out.println(url);
                }
                else
                {
                     String url="AdminControllerServlet;jsessionid="+session.getId();
                  out.println(url);
                }
             
            }
            else
            out.println("Error");
%>
