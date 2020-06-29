/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadedChat.dao;

import MultiThreadedChat.dbutil.DBConnection;
import MultiThreadedChat.pojo.ChatLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ChatLogDao {
    
    
    public static boolean addChat(ChatLog obj) throws SQLException
    {
    
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into chatchatlogs  values(?,?,?)");
      ps.setString(1,obj.getUsername());
      ps.setString(2,obj.getMsg());
      ps.setString(3,obj.getTime());
     int a=ps.executeUpdate();
      return a>0;
           
    }   
}
