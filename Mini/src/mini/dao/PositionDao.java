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
import mini.pojo.PositionInfoPojo;

/**
 *
 * @author bikrant bikram
 */
public class PositionDao {
    
    
    public static boolean addPosition(PositionInfoPojo obj) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into positioninfo values(?,?)");
      ps.setInt(1,obj.getPositionNo());
      ps.setString(2,obj.getPosionDetails());
      int a=ps.executeUpdate();
      return a>0;
    }
    public static int getLastPositionNo() throws SQLException
    {
        int a=1;
        Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select * from positionInfo");
  ResultSet rs= ps.executeQuery();
  while(rs.next())
  a=rs.getInt("position");
  return a;
    }
    public static boolean removePosition(int pos) throws SQLException
    {
     Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("remove from positioninfo where position=?");
      ps.setInt(1,pos);
      int a=ps.executeUpdate();
      return a>0;
    }
   public static String  getPositionInfo(int pos) throws SQLException
    {
        String  a="No such position no available";
        Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select * from positionInfo where position = ?");
  ps.setInt(1,pos);
  ResultSet rs= ps.executeQuery();

  if(rs.next())
  a=rs.getString("details");
  return a;
    }
   public static ArrayList<Integer> getAllPositions() throws SQLException
   {
      ArrayList<Integer> al = new ArrayList<Integer>();
      
     int a=1;
        Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select * from positionInfo");
  ResultSet rs= ps.executeQuery();
  while(rs.next())
  al.add(rs.getInt("position"));
  return al;
       
   }
}
