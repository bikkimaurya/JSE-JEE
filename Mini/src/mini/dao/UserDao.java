
package mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import mini.dbutil.DBConnection;
import mini.pojo.UserPojo;
import mini.pojo.UserProfilePojo;

/**
 *
 * @author bikrant bikram
 */
public class UserDao
{
    
    
    
public static boolean validateUser(UserPojo obj) throws SQLException
{
  Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select * from users where userid = ? and password= ? and type =?");
    System.out.println(obj);
  ps.setString(1,obj.getUserId());
  ps.setString(2,obj.getPassword());
  ps.setString(3,obj.getUserType());
  ResultSet rs= ps.executeQuery();
    System.out.println(rs);
  if(rs.next())
  {
      UserProfilePojo.setUserName(rs.getString("username"));
      return true;
  }
  return false;
}

public static boolean addUser(UserPojo user) throws SQLException
{
    Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("insert into users values(?,?,?,?,?)");
    
  ps.setString(1,user.getUserId());
  ps.setString(2,user.getUserName());
  ps.setString(3,user.getPassword());
  ps.setString(4,user.getUserType());
  ps.setString(5,user.getConatact());
  int i= ps.executeUpdate();
 return i>0;
}
public static ArrayList<String> getUserName() throws SQLException
{
    ArrayList<String> al = new ArrayList<>();
    
  Connection conn= DBConnection.getConnection();
  Statement st= conn.createStatement();
  ResultSet rs= st.executeQuery("select username from users");
  while(rs.next())
     al.add(rs.getString("username")) ;
  return al;
     
}

public static ArrayList<String>  getUserId(String userName) throws SQLException
{
    ArrayList<String> al = new ArrayList<>();
    Connection conn= DBConnection.getConnection();
  PreparedStatement ps= conn.prepareStatement("Select userid from users where username=?");
    
  ps.setString(1,userName);
  ResultSet rs= ps.executeQuery();
  while(rs.next())
      al.add(rs.getString("userid"));
  
 return al;
  
}
public static boolean isId(String userid) throws SQLException
{
//    boolean name=false;
    Connection conn= DBConnection.getConnection();
     PreparedStatement ps= conn.prepareStatement("Select * from users where userid= ?");
     ps.setString(1, userid);
     
     ResultSet rs=ps.executeQuery();
//     while(rs.next())
//     {
//         name=true;
//         
//     }

     return rs.next();   
}
}
