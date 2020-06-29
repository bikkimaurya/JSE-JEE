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
public class ScoreStorePojo
{

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ScoreStorePojo() {
    }

    public ScoreStorePojo(String userId, String examid, int right, int unattempted, double per, String language) {
        this.userId = userId;
        this.examid = examid;
        this.right = right;
        this.unattempted = unattempted;
        this.per = per;
        this.language = language;
    }

     private String userId;
    
     private String examid;
     private int right;
     private int unattempted;
     private double per;
     
      private String language;
    
    
    
    
    
    
    
    
    
}
