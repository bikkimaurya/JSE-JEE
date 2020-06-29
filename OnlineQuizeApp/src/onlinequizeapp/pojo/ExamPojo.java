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
public class ExamPojo
{

    public ExamPojo(String ExamId, String language, int totalQuestions) {
        this.ExamId = ExamId;
        this.language = language;
        this.totalQuestions = totalQuestions;
    }

    public ExamPojo() {
    }
    

    public String getExamId() {
        return ExamId;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
    private String ExamId;
    private String language;
    private int totalQuestions;
    
    
}
