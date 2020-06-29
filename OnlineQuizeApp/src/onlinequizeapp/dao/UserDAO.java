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
import onlinequizeapp.dbutil.DBConnection;
import onlinequizeapp.pojo.UserPojo;

/**
 *
 * @author bikrant bikram
 */
public class UserDAO 
{
public static boolean validateUser(UserPojo user) throws SQLException
{
//    boolean name=false;
    Connection conn= DBConnection.getConnection();
     PreparedStatement ps= conn.prepareStatement("Select * from users where userid= ? and  password =? and usertype=?");
     ps.setString(1, user.getUserId());
     ps.setString(2, user.getPassword());
     ps.setString(3, user.getUserType());
     ResultSet rs=ps.executeQuery();
//     while(rs.next())
//     {
//         name=true;
//         
//     }

     return rs.next();    
}

public static boolean addUser(UserPojo user) throws SQLException
{
    Connection conn= DBConnection.getConnection();
    PreparedStatement s= conn.prepareStatement("select * from users where userid=?");
    s.setString(1, user.getUserId());
    ResultSet rs=s.executeQuery(); 
    if(rs.next())
        return false;
    
     PreparedStatement ps= conn.prepareStatement("insert into users values(?,?,?)");
     ps.setString(1, user.getUserId());
     ps.setString(2, user.getPassword());
     ps.setString(3, user.getUserType());
     ResultSet s1=ps.executeQuery(); 
     return true;
    
    
}
public static boolean updateUser(String id , String pwd) throws SQLException
{
    
    
    Connection conn= DBConnection.getConnection();
    PreparedStatement s= conn.prepareStatement("update users  set password =? where userid=? ");
    s.setString(2, id);
    s.setString(1, pwd);
    int rs=s.executeUpdate();
    if(rs>0)
        return true;
    return false;
}
        








}
