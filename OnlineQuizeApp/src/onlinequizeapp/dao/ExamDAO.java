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
import onlinequizeapp.pojo.ExamPojo;

/**
 *
 * @author bikrant bikram
 */
public class ExamDAO 
{
    
    
   public static String getExamId()throws SQLException
   {
       int count=0;
        Connection conn= DBConnection.getConnection();
        Statement st= conn.createStatement();
        ResultSet rs= st.executeQuery("Select count (*) as totalrows from exam");
        while(rs.next())
            count=rs.getInt(1);
        return ("Ex-" +(count +1)) ;     
      
   }
   public static boolean addExam( ExamPojo newExam) throws SQLException
   {
       Connection conn= DBConnection.getConnection();
       PreparedStatement ps= conn.prepareStatement("insert into exam values(?,?,?)");
       ps.setString(1, newExam.getExamId());
       ps.setString(2,newExam.getLanguage());
       ps.setInt(3,newExam.getTotalQuestions());
       return ps.executeUpdate()==1;
           
   }
   public static ArrayList<ExamPojo> get() throws SQLException//not ssir
   {
       ArrayList<ExamPojo> al=new ArrayList<>();
       
       Connection conn= DBConnection.getConnection();
    PreparedStatement ps= conn.prepareStatement("Select * from exam");
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
        ExamPojo examPojo= new ExamPojo(rs.getString(1),rs.getString(2),rs.getInt(3));
        
        al.add(examPojo);
        
    }
     
       
       
       
       return al;
   }
   public static int getQ(ExamPojo e) throws SQLException
   {
      
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps= conn.prepareStatement("Select * from exam where examid= ? and  language =?");
    ps.setString(1,e.getExamId());
    ps.setString(2,e.getLanguage());
    ResultSet rs= ps.executeQuery();
    rs.next();
   return rs.getInt(3);
     
       
   }
   
   
   public static boolean isPaperSer(String language) throws SQLException
   {
Connection conn= DBConnection.getConnection();
    PreparedStatement ps= conn.prepareStatement("Select examid from exam where  language =?");
    ps.setString(1,language);
    
    ResultSet rs= ps.executeQuery();
    return rs.next();       
     
   }
   public static ArrayList<String> getExamIdBy(String userId, String subject) throws SQLException
   {
       ArrayList<String> al=new ArrayList<>();
       Connection conn= DBConnection.getConnection();
    PreparedStatement ps= conn.prepareStatement("Select examid from exam where  language =? minus select examid from performance where userid=?");
       ps.setString(1,subject);
    ps.setString(2,userId);
    ResultSet rs= ps.executeQuery();
   while(rs.next()) 
   {
      
      al.add(rs.getString(1));
   }
      
       
       return al;
   }
   public static int getQUestionCountByExam(String examid) throws SQLException
{
  
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps= conn.prepareStatement("Select totalquestion from exam where examid= ?");
    ps.setString(1, examid);

    ResultSet rs=     ps.executeQuery();
    rs.next();
    return rs.getInt(1);
     
}

   
    
    
    
    
    
    
    
    
    
}
