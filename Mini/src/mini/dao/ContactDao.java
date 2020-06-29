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
import mini.pojo.ContactPojo;

/**
 *
 * @author bikrant bikram
 */
public class ContactDao {
    public static boolean add(ContactPojo obj) throws SQLException
    {
        
   Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into contacts values(?,?,?)");
      ps.setString(1,obj.getName());
      ps.setString(2,obj.getDepartment());
      ps.setString(3,obj.getContactNo());
     
      int a=ps.executeUpdate();
      return a>0;  
    }
        public static ArrayList<ContactPojo> getAll() throws SQLException
    {
        
       ArrayList<ContactPojo> al = new ArrayList<>() ;
       Connection conn= DBConnection.getConnection();
  Statement st= conn.createStatement();
  ResultSet rs= st.executeQuery("select * from contacts");
  while(rs.next())
  {
      ContactPojo obj= new ContactPojo(rs.getString(1),rs.getString(2),rs.getString(3));
     al.add(obj);    
  }
   
  return al;   
    }
    
}
