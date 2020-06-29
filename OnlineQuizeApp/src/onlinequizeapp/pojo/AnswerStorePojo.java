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
public class AnswerStorePojo {
    private ArrayList<AnswerPojo> answerList = new ArrayList<>() ;
    public void addAnswer(AnswerPojo answerPojo)
    {
        answerList.add(answerPojo);
        
    }
    public AnswerPojo getAnswer(int pos)
    {
        return answerList.get(pos);
        
    }   
     
     public void removeAnswer(int poj) 
        {
           answerList.remove(poj);
           
        }
     public void setAnwer(int pos,AnswerPojo ans)
     {
         answerList.add(pos,ans);
         
     }
    public  ArrayList<AnswerPojo> getAllAnswers()
     {
         return  answerList;
           
     }
    public AnswerPojo getAnswerByQno(int qno)
    {
        for(AnswerPojo a:answerList )
            if(a.getQmo()==qno)
                return a;
        return null;
        
    }
    public int getCount()
    {
      return answerList.size();
    }
    
    public int removeAnswer(AnswerPojo answer)
    {
        int poj = answerList.indexOf(answer);
        answerList.remove(poj);
        return poj;
        
        
        
    }
    
    
    
    
    
    
}
