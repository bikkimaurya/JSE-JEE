/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadedChat.pojo;

/**
 *
 * @author bikrant bikram
 */
public class ChatClient {

    @Override
    public String toString() {
        return "ChatClient{" + "username=" + username + ", password=" + password + '}';
    }

    public ChatClient(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public ChatClient() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    String username;
    String password;
    
    
    
    
}
