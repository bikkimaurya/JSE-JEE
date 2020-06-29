package shoppingcatalog.dbutil;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author bikrant bikram
 */
public class DBConnection {
    private static Connection conn;
    static
    {
         try
                {
                    Class.forName("oracle.jdbc.OracleDriver");
                    conn=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@//MAURYA:1521/xe","abhishekmaurya","abhishek@786");
                    System.out.println("Connnected to dB");
                    
                }
                catch(Exception e) 
                        {
                            System.out.println("Error in DB");
                          e.printStackTrace();
                        }
    }
    public  static Connection getConnection()//bcs we didnt wanted to create object of this class
    {
        return conn;
    }
    
    
    public static void closeConnection()//for closing connection 
    {
        try
        {
            conn.close();
            System.out.println("Connection closed to DB.");
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Error in closing the DB.");
          
        }
    }
    
    
    
}
