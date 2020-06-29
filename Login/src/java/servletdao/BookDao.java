
package servletdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDao {
   public static ArrayList<String> bookByName(Connection c,String bname) throws SQLException
   {
       ArrayList<String> al = new ArrayList<>();
      
       Connection conn=c;

            PreparedStatement ps= conn.prepareStatement("Select * from books where bname=?");
            ps.setString(1, bname);
            ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
               al.add( rs.getString("price"));
                
            }
       return al;
   }
}