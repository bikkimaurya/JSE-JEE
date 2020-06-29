/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinequizeapp.pojo;

import java.util.ArrayList;

/**
 *
 * @author bikrant bikram
 */
public class QuestionStore 
{

    
    
    
    ArrayList <QuestionPojo> questionList;
    
    
    
    
    public ArrayList<QuestionPojo> getAllQuestion() {
        return questionList;
    }   

    public QuestionStore() 
    {
        questionList =new ArrayList();
        
    }
    public int getCount()
    {
        
        return questionList.size();
        
    }
     


    public QuestionStore(ArrayList<QuestionPojo> questionList) {
        this.questionList = questionList;
    }
    public void addQuestions(QuestionPojo q)
    {
   
    questionList.add(q);
    
     }
    public QuestionPojo getQusestion(int pos){
        
        
        return questionList.get(pos);
        
    }
    public void setQuestionAt(int pos ,QuestionPojo q)
    {
      questionList.add(pos, q);
    }
    public void removeQuestion(int pos)
    {
        questionList.remove(pos);
        
    }
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
}
