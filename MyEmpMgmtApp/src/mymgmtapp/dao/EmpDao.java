/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymgmtapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import myempmgmtapp.pojo.EmpPojo;
import mymgmtapp.dbutil.DBConnection;

/**
 *
 * @author bikrant bikram
 */
public class EmpDao 
{
  public static boolean addEmp(EmpPojo obj) throws SQLException//jbb hme exception khi aur handel krna ho to um is trk exptn pass kr dete hai 
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("Insert into emp values(?,?,?)");
      ps.setInt(1,obj.getEmpno());
      ps.setString(2,obj.getEname());
      ps.setDouble(3,obj.getEsal());
      int count =ps.executeUpdate();
      return  (count ==1);
      
      
      
  }
  public static ArrayList <EmpPojo> getAllEmp() throws SQLException
  {
   ArrayList <EmpPojo> ar= new ArrayList<>();
   Connection conn=DBConnection.getConnection();
    
    Statement st= conn.createStatement();
    ResultSet rs= st.executeQuery("select * from emp");
    
    while(rs.next())
    {
        int eno= rs.getInt(1);
        String ename=rs.getString(2);
        Double esal=rs.getDouble(3);
        EmpPojo obj=new EmpPojo(eno,ename,esal);
        ar.add(obj);
        
        
    }
      return ar;
  }
  public static EmpPojo findEmpBbyId(int id) throws SQLException 
  {
     EmpPojo temp=null;
     Connection conn= DBConnection.getConnection();
     PreparedStatement ps= conn.prepareStatement("Select * from emp where id= ?");
     ps.setInt(1,id);
    ResultSet rs= ps.executeQuery();
    if(rs.next())
    {
        temp= new EmpPojo();  

        temp.setEname(rs.getString(2));
        temp.setEmpno(id);
        temp.setEsal(rs.getDouble(3));
        
    }
    
         
     return temp; 
  }
  public static boolean deleteEmp(int id)throws SQLException
            {
                
//                 EmpPojo temp=null;
                Connection conn= DBConnection.getConnection();
                PreparedStatement ps= conn.prepareStatement("Delete  from emp where id= ?");
                 ps.setInt(1,id);
                       int  rs=ps.executeUpdate();
                 if(rs>0)
                    return true;
                else 
                return false;
//    ResultSet rs= ps.executeQuery();
//    if(rs.next())
//    {
//        temp= new EmpPojo();  
//
//        temp.setEname(rs.getString(2));
//        temp.setEmpno(id);
//        temp.setEsal(rs.getDouble(3));
//        
//    }
              
                
       //         return temp;
            }
  
  public static boolean updateEmp( int eid,String name,Double sal) throws SQLException
  {
//      boolean temp = false;
//      if(deleteEmp(id))
//      {
//          EmpPojo e = new EmpPojo(id,name,sal);
//          addEmp(e);
//        temp=true;
//          
//      }
//      return temp;
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("Update  emp set name=?,sal=? where id= ? ");
       ps.setInt(3,eid);
      
 
      ps.setString(1,name);
      ps.setDouble(2,sal);
      int  rs=ps.executeUpdate();
      if(rs>0)
          return true;
      else 
          return false;
      
      
      
  }
  
  
}
