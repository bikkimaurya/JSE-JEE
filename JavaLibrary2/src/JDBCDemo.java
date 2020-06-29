
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikrant bikram
 */
public class JDBCDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Connection conn;
       try
       {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("driver loaded");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//MAURYA:1521/xe", "abhishekmaurya", "abhishek@786");
            Statement st= conn.createStatement();
            System.out.println(st.executeLargeUpdate("CREATE"));
            
           
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
      
       
        
        
        
        
    }
    
}
