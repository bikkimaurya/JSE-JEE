<%-- 
    Document   : showitembytype
    Created on : 30 Jun, 2019, 10:34:38 PM
    Author     : bikrant bikram
--%>

<%@page import="shoppingcatalog.dto.ItemInfoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shoppingcatalog.dto.ItemDTO"%>
<%@page errorPage="showerror.jsp" contentType="text/html" pageEncoding="UTF-8"%>

        <%
           
            StringBuffer d=new StringBuffer("");
            d.append("<ul>");
            ArrayList<ItemInfoDTO> bl=(ArrayList<ItemInfoDTO>)request.getAttribute("al");
            for(ItemInfoDTO item:bl)
            out.println("<li  onclick=dotask('"+item.getItemId()+"')>"+item.getItemName()+"   </li>");
            d.append("</ul>");
            out.println(d);
            %>
