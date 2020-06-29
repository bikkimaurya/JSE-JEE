
package mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mini.dbutil.DBConnection;
import mini.pojo.RoutInfoPojo;

/**
 *
 * @author bikrant bikram
 */
public class RoutDao {
    public static boolean addRout(ArrayList<RoutInfoPojo> al) throws SQLException
    {
        int a=0;
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into routinfo values(?,?,?)");
      for(RoutInfoPojo obj:al)
      {
      ps.setInt(1,obj.getRoutNo());
      ps.setString(2,obj.getRout());
      ps.setString(3,obj.getRoutDetalis());
      a=ps.executeUpdate(); 
        
      }
      
          return a>0;     
    }
    public static RoutInfoPojo getRoutByName(String r) throws SQLException
    {
       RoutInfoPojo routInfoPojo=null;
    Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select * from routinfo where rout=?");
    
  ps.setString(1,r);
  ResultSet rs= ps.executeQuery();
  if(rs.next())
  {
     routInfoPojo= new RoutInfoPojo(rs.getInt(1),rs.getString(2),rs.getString(3)) ;
      
  }
 return routInfoPojo ;
    }
    
     public static RoutInfoPojo getRoutByNo(int r) throws SQLException
    {
       RoutInfoPojo routInfoPojo=null;
    Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select * from routinfo where routNo=?");
    
  ps.setInt(1,r);
  ResultSet rs= ps.executeQuery();
  if(rs.next())
  {
      routInfoPojo= new RoutInfoPojo(rs.getInt(1),rs.getString(2),rs.getString(3)) ;
  }   
  
 return routInfoPojo ;
    }
     public static ArrayList<Integer> getAllRout() throws SQLException
    {
      ArrayList<Integer> al = new ArrayList<Integer>();
      
    Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select * from routinfo ");

  ResultSet rs= ps.executeQuery();
  if(rs.next())
  {
     al.add(rs.getInt(1));
     
  }   
  
 return al;
    }
    
    
}
