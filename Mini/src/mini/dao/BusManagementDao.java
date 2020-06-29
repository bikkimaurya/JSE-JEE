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
import java.sql.Statement;
import java.util.ArrayList;
import mini.dbutil.DBConnection;
import mini.pojo.BusManagementPojo;
import mini.pojo.ContactPojo;
import mini.pojo.RoutInfoPojo;

/**
 *
 * @author bikrant bikram
 */
public class BusManagementDao {
    public static boolean add(BusManagementPojo obj) throws SQLException
    {
        
   Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into busmanagement values(?,?,?,?,?)");
      ps.setInt(1,obj.getPosno());
      ps.setString(2,obj.getBusno());
      ps.setString(3,obj.getDrivername());
      ps.setInt(4,obj.getRout());
      ps.setInt(5,obj.getPriority());
      int a=ps.executeUpdate();
      return a>0;  
    }
        public static ArrayList<BusManagementPojo> getAll() throws SQLException
    {
        
       ArrayList<BusManagementPojo> al = new ArrayList<>() ;
       Connection conn= DBConnection.getConnection();
  Statement st= conn.createStatement();
  ResultSet rs= st.executeQuery("select * from BusManagement");
  while(rs.next())
  {
      BusManagementPojo obj= new BusManagementPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
     al.add(obj);    
  }
   
  return al;   
    }
    
        public static BusManagementPojo getRoutByNo(int rout) throws SQLException
    {
      BusManagementPojo routInfoPojo=null;
    Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select * from BusManagement where routno=?");
    
  ps.setInt(1,rout);
  ResultSet rs= ps.executeQuery();
  if(rs.next())
  {
      routInfoPojo= new BusManagementPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
  }   
  
 return routInfoPojo ;
    }
    
}
