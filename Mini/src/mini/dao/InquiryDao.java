/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mini.dbutil.DBConnection;
import mini.pojo.InquiryPojo;

/**
 *
 * @author bikrant bikram
 */
public class InquiryDao {
    
    public static boolean add(InquiryPojo obj) throws SQLException
    {
        
   Connection conn=DBConnection.getConnection();
      PreparedStatement ps= conn.prepareStatement("insert into inquiry values(?,?,?,?,?)");
      ps.setString(1,obj.getMobno());
      ps.setString(2,obj.getEmailId());
      ps.setString(3,obj.getPurpose());
      ps.setString(4,obj.getType());
      ps.setString(5,obj.getMsg());
      int a=ps.executeUpdate();
      return a>0;  
    }
    
}
