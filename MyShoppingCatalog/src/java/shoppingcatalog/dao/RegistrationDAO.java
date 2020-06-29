
package shoppingcatalog.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import shoppingcatalog.dbutil.DBConnection;
import shoppingcatalog.dto.UserDTO;

public class RegistrationDAO 
{
    private static PreparedStatement ps=null;
    private static PreparedStatement ps1=null;
    static
    {
        try {
            ps=DBConnection.getConnection().prepareStatement("Select * from members where username=?");
            ps1=DBConnection.getConnection().prepareStatement("insert into members values(?,?,?)");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    
    
    public static boolean validateUserName(String username) throws SQLException
    {
        
        ps.setString(1, username);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    
    public static boolean insertUser(UserDTO user) throws SQLException
    {
        System.out.println(user+"into DAO");
      ps1.setString(1, user.getUsername());
     ps1.setString(2, user.getPassword());
     ps1.setString(3, user.getUsertype());
     int rs=ps1.executeUpdate();

     return rs>0;   
    }
    
    
    
}

