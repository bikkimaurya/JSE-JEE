/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinequizeapp.pojo;

import java.util.Objects;

/**
 *
 * @author bikrant bikram
 */
public class AnswerPojo 
{

    public AnswerPojo() 
    {
    }

    public AnswerPojo(String ExamId, String subject, int qmo, String choosenAnswer, String correctAnswer) {
        this.ExamId = ExamId;
        this.subject = subject;
        this.qmo = qmo;
        this.choosenAnswer = choosenAnswer;
        this.correctAnswer = correctAnswer;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnswerPojo other = (AnswerPojo) obj;
        if (this.qmo != other.qmo) {
            return false;
        }
        if (!Objects.equals(this.ExamId, other.ExamId)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.choosenAnswer, other.choosenAnswer)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnswerPojo{" + "ExamId=" + ExamId + ", subject=" + subject + ", qmo=" + qmo + ", choosenAnswer=" + choosenAnswer + ", correctAnswer=" + correctAnswer + '}';
    }

    public String getExamId() {
        return ExamId;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getQmo() {
        return qmo;
    }

    public void setQmo(int qmo) {
        this.qmo = qmo;
    }

    public String getChoosenAnswer() {
        return choosenAnswer;
    }

    public void setChoosenAnswer(String choosenAnswer) {
        this.choosenAnswer = choosenAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    private String ExamId;
    private String subject;
    private int qmo; 
    private String choosenAnswer;
    private String correctAnswer;
    
    
    
    
    
    
    
}
