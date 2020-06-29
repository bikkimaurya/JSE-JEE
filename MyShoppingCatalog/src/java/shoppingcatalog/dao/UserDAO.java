
package shoppingcatalog.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import shoppingcatalog.dbutil.DBConnection;
import shoppingcatalog.dto.UserDTO;

public class UserDAO {
    private static PreparedStatement ps;
    static
    {
        try
        {
            ps=DBConnection.getConnection().prepareStatement("Select * from members where username=? and  password=? and membertype=?");
            
        }
        catch (Exception ex)
        {
           ex.printStackTrace();
        }
            

    }
    
    
    
  public static boolean validateUser(UserDTO user) throws SQLException
  {
//     PreparedStatement ps= conn.prepareStatement("Select * from users where userid= ? and  password =? and usertype=?");
     ps.setString(1, user.getUsername());
     ps.setString(2, user.getPassword());
     ps.setString(3, user.getUsertype());
     ResultSet rs=ps.executeQuery();
//     while(rs.next())
//     {
//         name=true;
//         
//     }

     return rs.next();    
  }
    
}
