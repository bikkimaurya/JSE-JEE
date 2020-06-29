/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcatalog.dto;

/**
 *
 * @author bikrant bikram
 */
public class UserDTO {

    @Override
    public String toString() {
        return "UserDTO{" + "usename=" + username + ", password=" + password + ", usertype=" + usertype + '}';
    }
    
    
    private String username;
    private String password;
    private String usertype;



    public String getUsername() {
        return username;
    }

    public void setUsername(String usename) {
        this.username = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    
    
    
}
