/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcatalog.dto;

import java.sql.Date;

/**
 *
 * @author bikrant bikram
 */
public class OrderDTO {

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public float getAnount() {
        return anount;
    }

    public void setAnount(float anount) {
        this.anount = anount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String orderid;
    private float anount;
    private Date date;
    
}
