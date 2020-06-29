
package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;


public class DBConnection implements ServletContextListener {
Connection conn=null;
   ServletContext sc=null;

    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
              conn=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@//MAURYA:1521/xe","advancejava","java");
            System.out.println("tunnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
   
   sc=sce.getServletContext();

   sc.setAttribute("connector",conn);
        
    } catch (ClassNotFoundException ex) {
        sc.setAttribute("exception", ex);
        } catch (SQLException ex) {
            sc.setAttribute("exception", ex);
     ex.printStackTrace();
        }
    }
    public void contextDestroyed(ServletContextEvent sce)
    {
    try {
        if(conn!=null)
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
}
