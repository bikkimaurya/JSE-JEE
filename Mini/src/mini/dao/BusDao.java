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
import mini.pojo.BusInfoPojo;

/**
 *
 * @author bikrant bikram
 */
public class BusDao 
{
    public static boolean addBus(BusInfoPojo obj) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into businfo values(?,?,?,?)");
      ps.setString(1,obj.getBusNo());
      ps.setString(2,obj.getOwnerName());
      ps.setString(3,obj.getContactNo());
      ps.setInt(4,obj.getCapacity());
      int a=ps.executeUpdate();
      return a>0;
           
    }
    public static ArrayList<BusInfoPojo> getAllBus() throws SQLException
    {
        
       ArrayList<BusInfoPojo> al = new ArrayList<>() ;
       Connection conn= DBConnection.getConnection();
  Statement st= conn.createStatement();
  ResultSet rs= st.executeQuery("select * from businfo");
  while(rs.next())
  {
      BusInfoPojo obj= new BusInfoPojo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
     al.add(obj);
       
  }

      
  return al;
        
        
    }
    public static ArrayList<String> getAllBusNo() throws SQLException
    {
        
       ArrayList<String> al = new ArrayList<>() ;
       Connection conn= DBConnection.getConnection();
  Statement st= conn.createStatement();
  ResultSet rs= st.executeQuery("select * from businfo");
  while(rs.next())
  {
     al.add(rs.getString(1));
       
  }

      
  return al;
        
        
    }
    
}
