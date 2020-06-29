/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import regapp.dbutil.DBConnection;
import regapp.dto.UserDTO;

/**
 *
 * @author $HUBH_AM
 */
public class UserDAO {

    public static boolean findUser(String userid) throws SQLException 
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from allusers where userid = ?");
        ps.setString(1, userid);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    
    public static boolean registerUser(UserDTO user) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into allusers values(? , ? , ?)");
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getUserid());
        ps.setString(3, user.getPassword());
        return ps.executeUpdate() == 1;
    }
}
