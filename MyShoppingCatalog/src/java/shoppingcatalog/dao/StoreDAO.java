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
import shoppingcatalog.dto.ItemInfoDTO;

/**
 *
 * @author bikrant bikram
 */
public class StoreDAO {
    private static  Statement st=null;
    private static  PreparedStatement ps=null;
    private static  PreparedStatement ps1=null;
    static 
    {
        try {
            st=DBConnection.getConnection().createStatement();
            ps=DBConnection.getConnection().prepareStatement("select item_name ,id from store_items where item_type=?");
            ps1=DBConnection.getConnection().prepareStatement("select * from store_items where id=?");
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        
    }
    
    public static ArrayList<String> getItemTypes() throws SQLException
    {
        ArrayList<String> al = new ArrayList<String>();
        ResultSet rs=st.executeQuery("Select distinct item_type from store_items");
        while(rs.next())
        
            al.add(rs.getString(1));
        return al;
        
    }
    public static ArrayList<ItemInfoDTO> getItemsByTypes(String type) throws SQLException
    {
        System.out.println(type +"in DAO ITEM TYOE");
        ArrayList<ItemInfoDTO> al = new ArrayList<>();
        ps.setString(1,type);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            ItemInfoDTO item= new ItemInfoDTO();
            item.setItemId(rs.getString(2));
            item.setItemName(rs.getString(1));
            System.out.println(item+"in DAO");
            al.add(item);
        }
        
        return al;
        
    }
     public static ItemDTO getItemsInfo(String type) throws SQLException
    {
       
        ItemDTO item= new ItemDTO();
        ps1.setString(1,type);
        ResultSet rs=ps1.executeQuery();
        while(rs.next())
        {
            
            item.setItemId(rs.getString("ID"));
            item.setItemType(rs.getString("ITEM_TYPE"));
            item.setItemName(rs.getString("ITEM_NAME"));
            item.setItemPrice(rs.getDouble("ITEM_PRICE"));
            item.setItemImage(rs.getString("ITEM_IMAGE"));
            item.setItemDesc(rs.getString("ITEM_DESC"));
            
            
        }
        
        return item;
        
    }
     
     
     
    
    
}
