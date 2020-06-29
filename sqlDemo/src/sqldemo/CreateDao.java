
package sqldemo;

import dbUtil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bikrant bikram
 */
public class CreateDao {
    public static void create(String tablename ,String c) throws SQLException
    {
        Connection conn= DBConnection.getConnection();
        PreparedStatement st = conn.prepareStatement("create table "+ tablename+"("+c+" varchar2(10))");
        st.executeUpdate();
        
        
    }
}
