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
public class StudentScorePojo {

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public StudentScorePojo() {
    }

    public StudentScorePojo(String language, double percentage) {
        this.language = language;
        this.percentage = percentage;
    }
    
   private String language;
   private double percentage;
    
    
    
    
    
   
    
}
