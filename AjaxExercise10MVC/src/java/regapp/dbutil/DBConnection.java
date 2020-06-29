/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author $HUBH_AM
 */
public class DBConnection {
    private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//MAURYA:1521/xe" , "advancejava" , "java");
            //JOptionPane.showMessageDialog(null, "Connected to DataBase" , "Success !" , JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Cannot connect to the DataBase!" , "Error !" , JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static Connection getConnection()
    {
        return conn;
    }
    
    public static void closeConnection()
    {
        try
        {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Successfully disconnected to the DataBase!" , "Dissconnected" , JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Cannot close the connection to the DataBase!" , "Error in Dissconnecting" , JOptionPane.ERROR_MESSAGE);
        }
    }
}
