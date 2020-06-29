
package mini.pojo;

/**
 *
 * @author bikrant bikram
 */
public class UserPojo {

    public UserPojo() {
    }

    public UserPojo(String userName, String userId, String conatact, String userType, String password) {
        this.userName = userName;
        this.userId = userId;
        this.conatact = conatact;
        this.userType = userType;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "UserPojo{" + "userName=" + userName + ", userId=" + userId + ", conatact=" + conatact + ", userType=" + userType + ", password=" + password + '}';
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConatact() {
        return conatact;
    }

    public void setConatact(String conatact) {
        this.conatact = conatact;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    String userName;
    String userId;
    String conatact;
    String userType;
    String password;
    
}
