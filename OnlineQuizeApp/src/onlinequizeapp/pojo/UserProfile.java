/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinequizeapp.pojo;

/**
 *
 * @author bikrant bikram
 */
public class UserProfile 
{
    private static String userName;
    private static String userType;

    public static String getUserName() {
        return userName;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserName(String userName) {
        UserProfile.userName = userName;
    }

    public static void setUserType(String userType) {
        UserProfile.userType = userType;
    }
    
    
}
