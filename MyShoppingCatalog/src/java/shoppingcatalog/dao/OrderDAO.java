/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcatalog.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import shoppingcatalog.dbutil.DBConnection;
import shoppingcatalog.dto.ItemDTO;
import shoppingcatalog.dto.OrderDTO;
import shoppingcatalog.dto.OrderDetailsDTO;

/**
 *
 * @author bikrant bikram
 */
public class OrderDAO {
    private static Statement st;
    private static PreparedStatement ps1;
    private static PreparedStatement ps2;
    private static PreparedStatement ps3;
    private static PreparedStatement ps4;
    static 
    {
        try {
            ps1=DBConnection.getConnection().prepareStatement("insert into order_master values(?,?,?,?)");
            ps2=DBConnection.getConnection().prepareStatement("insert into order_details values(?,?,?)");
            ps3=DBConnection.getConnection().prepareStatement("select * from order_master where cust_name=?");
            ps4=DBConnection.getConnection().prepareStatement("select * from order_details where order_id=?");
            st=DBConnection.getConnection().createStatement();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        
    }
    
    public static void addOrder(String username,float amount,ArrayList<ItemDTO> al) throws SQLException
    {
        int count=0;
       ResultSet rs=st.executeQuery("Select count (*) as totalrows from order_master");
        while(rs.next())
            count=rs.getInt(1);
        String orderid="ORD_" +(count +1) ;
        java.util.Date d=new java.util.Date();
       java.sql.Date date=new java.sql.Date(d.getTime());
        
        
        ps1.setString(1, orderid);
        ps1.setString(2, username);
        ps1.setFloat(3, amount);
        ps1.setDate(4, date);
        ps1.executeUpdate();
        
        for(ItemDTO item:al)
        {
        ps2.setString(1, orderid);
        ps2.setString(2,item.getItemName());
        ps2.setFloat(3, (float)item.getItemPrice());
        ps2.executeUpdate();
        }
        
        
    }
    
    public static ArrayList<OrderDTO> getOrder(String username) throws SQLException
    {
        ArrayList<OrderDTO> al = new ArrayList<OrderDTO>();
        ps3.setString(1, username);
        
        ResultSet rs= ps3.executeQuery();
        while(rs.next())
        {
          OrderDTO order= new OrderDTO();
          order.setOrderid(rs.getString(1));
          order.setDate(rs.getDate(4));
          order.setAnount(rs.getFloat(3));
           al.add(order);
            
        }
        return al;
    }
     public static ArrayList<OrderDetailsDTO> getOrderDetails(String orderid) throws SQLException
    {
        ArrayList<OrderDetailsDTO> al = new ArrayList<>();
        ps4.setString(1, orderid);
        
        ResultSet rs= ps4.executeQuery();
        while(rs.next())
        {
          OrderDetailsDTO order= new OrderDetailsDTO();
          order.setItemname(rs.getString(2));
          order.setPrice(rs.getFloat(3));
         
           al.add(order);
            
        }
        return al;
    }
     
     
}
