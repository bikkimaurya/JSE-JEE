/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mini.dbutil.DBConnection;
import mini.pojo.StudentPojo;

/**
 *
 * @author bikrant bikram
 */
public class StudentDao {
     public static boolean add(StudentPojo obj) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into students values(?,?,?,?,?)");
      ps.setString(1,obj.getName());
      ps.setString(2,obj.getEnrollmentNo());
      ps.setString(3,obj.getMobNo());
      ps.setString(4,obj.getFathersMobNo());
      ps.setString(5,obj.getRoomNo());
     
      int a=ps.executeUpdate();
      return a>0;  
        
        
        
        
    }   
     public static String   getName(String id) throws SQLException
{
   String username= null;
    Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select name from students where ENROLLMENTNO=?");
    
  ps.setString(1,id);
  ResultSet rs= ps.executeQuery();
  if(rs.next())
      username=rs.getString("name");
  
 return username;
  
}
    
}
