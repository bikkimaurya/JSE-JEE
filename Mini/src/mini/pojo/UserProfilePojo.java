package mini.pojo;

/**
 *
 * @author bikrant bikram
 */
public class UserProfilePojo 
{

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        UserProfilePojo.userId = userId;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserProfilePojo.userName = userName;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        UserProfilePojo.userType = userType;
    }
    static String userId;
    static String userName;
    static String userType;
}
