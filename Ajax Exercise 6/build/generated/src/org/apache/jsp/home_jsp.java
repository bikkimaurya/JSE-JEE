package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ajax Exercise 6</title>\n");
      out.write("        <script>\n");
      out.write("            ajaxreq = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("            function show()\n");
      out.write("            {\n");
      out.write("                ajaxreq.onreadystatechange = processresponse;\n");
      out.write("                var empno = document.getElementById(\"empid\").value;\n");
      out.write("                ajaxreq.open(\"GET\" ,\"showdetails.jsp?eno=\" + empno,true );\n");
      out.write("                ajaxreq.send(null);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function processresponse()\n");
      out.write("            {\n");
      out.write("                if(ajaxreq.readyState === 4)\n");
      out.write("                {\n");
      out.write("                    var edetails = document.getElementById(\"result\");\n");
      out.write("                    edetails.innerHTML = ajaxreq.responseText;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#fff8888\">\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <div id=\"result\"></div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
