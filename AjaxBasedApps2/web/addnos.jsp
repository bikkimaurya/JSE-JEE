<%
response.setDateHeader("Expires",-1);
int a=Integer.parseInt(request.getParameter("firstnum"));
int b=Integer.parseInt(request.getParameter("secnum"));
int c=a+b;
out.println("Sum is "+c);
%>
