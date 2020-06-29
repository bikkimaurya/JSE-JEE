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
public class PerformancePojo {

    public PerformancePojo(String examId, String language, String userId, int right, int wrong, int unattampted, double per) {
        this.examId = examId;
        this.language = language;
        this.userId = userId;
        this.right = right;
        this.wrong = wrong;
        this.unattampted = unattampted;
        this.per = per;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnattampted() {
        return unattampted;
    }

    public void setUnattampted(int unattampted) {
        this.unattampted = unattampted;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }
    private String examId;
    private String language;
    private String userId;
    private int right;
    private int wrong;
    private int unattampted;
    private double per;
}
