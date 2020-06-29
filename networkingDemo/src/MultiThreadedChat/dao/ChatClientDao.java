/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadedChat.dao;

import MultiThreadedChat.dbutil.DBConnection;
import MultiThreadedChat.pojo.ChatClient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bikrant bikram
 */
public class ChatClientDao {
    public static boolean addClient(ChatClient obj) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into chatclients values(?,?)");
      ps.setString(1,obj.getUsername());
      ps.setString(2,obj.getPassword());
      int a=ps.executeUpdate();
      return a>0;
           
    }
    public static boolean findClient(String name) throws SQLException
    {
        
      Connection conn= DBConnection.getConnection();
    PreparedStatement s= conn.prepareStatement("select * from chatclients  where username=?");
    s.setString(1, name);
    ResultSet rs=s.executeQuery(); 
    if(rs.next())
        return true;
    return false;
    }
    public static boolean findPassword(String pass) throws SQLException
    {
        
      Connection conn= DBConnection.getConnection();
    PreparedStatement s= conn.prepareStatement("select * from chatclients  where password=?");
    s.setString(1, pass);
    ResultSet rs=s.executeQuery(); 
    
    return rs.next();
    }
    
    
    
    
}
