
package mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mini.dbutil.DBConnection;
import mini.pojo.DriverInfoPojo;

/**
 *
 * @author bikrant bikram
 */
public class DriverDao {
    
    
    public static boolean addDriver(DriverInfoPojo obj) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into driverinfo values(?,?,?,?,?,?,?)");
      ps.setString(1,obj.getName());
      ps.setInt(2,obj.getAge());
      ps.setString(3,obj.getDlNo());
      ps.setString(4,obj.getDlValidFrom());
      ps.setString(5,obj.getDlValidUpto());
      ps.setString(6,obj.getContactNo());
      
      ps.setString(7,obj.getAddress());
      int a=ps.executeUpdate();
      return a>0;  
        
        
        
        
        
    }
    public static ArrayList<String> getAllDriver() throws SQLException
   {
      ArrayList<String> al = new ArrayList<>();
      
     int a=1;
        Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select * from driverinfo");
  ResultSet rs= ps.executeQuery();
  while(rs.next())
  al.add(rs.getString("name"));
  return al;
       
   }
    
}
