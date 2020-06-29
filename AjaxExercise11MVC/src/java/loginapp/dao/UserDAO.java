/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import loginapp.dbutil.DBConnection;
import loginapp.dto.UserDTO;

/**
 *
 * @author $HUBH_AM
 */
public class UserDAO {

    public static boolean findUser(UserDTO user) throws SQLException 
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select username from allusers where userid = ? and password = ?");
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getPassword());
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            user.setUsername(rs.getString(1));
            return true;
        }
        return false;
    }
}
