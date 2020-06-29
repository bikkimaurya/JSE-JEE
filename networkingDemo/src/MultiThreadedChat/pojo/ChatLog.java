
package MultiThreadedChat.pojo;

/**
 *
 * @author bikrant bikram
 */
public class ChatLog {

    public ChatLog(String username, String msg, String time) {
        this.username = username;
        this.msg = msg;
        this.time = time;
    }

    public ChatLog() {
    }

    @Override
    public String toString() {
        return "ChatLog{" + "username=" + username + ", msg=" + msg + ", time=" + time + '}';
    }
    
    String username;
    String msg;
    String time;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
