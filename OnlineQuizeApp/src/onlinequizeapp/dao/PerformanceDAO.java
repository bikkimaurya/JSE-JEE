/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinequizeapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import onlinequizeapp.dbutil.DBConnection;
import onlinequizeapp.pojo.PerformancePojo;
import onlinequizeapp.pojo.ScoreStorePojo;
import onlinequizeapp.pojo.StudentScorePojo;

/**
 *
 * @author bikrant bikram
 */
public class PerformanceDAO {
    public static ArrayList<String> getAllStudentId() throws SQLException
    {
        ArrayList<String> studentList= new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        Statement st =conn.createStatement();
        ResultSet rs= st.executeQuery( "select distinct userid from performance");
        while(rs.next())
            studentList.add(rs.getString(1));
        return studentList;
    }
    
    public static ArrayList<String> getAllStudentExamId( String UserName ) throws SQLException
    {
        ArrayList<String> studentList= new ArrayList<>();
        Connection conn = DBConnection.getConnection();
         PreparedStatement ps= conn.prepareStatement("select examid from performance where userid=?");
          ps.setString(1,UserName);
           ResultSet rs= ps.executeQuery();
        while(rs.next())
            studentList.add(rs.getString(1));
        return studentList;
    }
    
    public static StudentScorePojo getScore( String UserName,String id ) throws SQLException
    {
        StudentScorePojo sc= new StudentScorePojo();
        Connection conn = DBConnection.getConnection();
         PreparedStatement ps= conn.prepareStatement("select per ,language  from performance where userid=? and examid= ?");
         ps.setString(1,UserName);
         ps.setString(2,id);
         
        ResultSet rs= ps.executeQuery();
      while( rs.next())
      {
           sc.setLanguage(rs.getString(2));
           sc.setPercentage(rs.getDouble(1));
       
      }
       return sc;
    }
    public static ArrayList<ScoreStorePojo> getPerformance() throws SQLException
    {
        ArrayList<ScoreStorePojo> al = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
         PreparedStatement ps= conn.prepareStatement("select  * from performance");
         ResultSet rs= ps.executeQuery();
         while(rs.next())
         {
           
             ScoreStorePojo scoreStorePojo= new ScoreStorePojo(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getDouble(5),rs.getString(6)) ;
             al.add(scoreStorePojo);
      
         }
         
      return al;
    }
    public static void addPerformance(PerformancePojo pr) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
         PreparedStatement ps= conn.prepareStatement("Insert into performance values(?,?,?,?,?,?)");
         ps.setString(1, pr.getUserId());
         ps.setString(2, pr.getExamId());
         ps.setInt(3, pr.getRight());
        // ps.setInt(4, pr.getWrong());
         ps.setInt(4, pr.getUnattampted());
         ps.setDouble(5, pr.getPer());
         ps.setString(6, pr.getLanguage());
       ps.executeUpdate();
    }
    
    
    
    
    
    
    
    
             
    }
   
