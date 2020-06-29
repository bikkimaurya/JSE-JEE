
package onlinequizeapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import onlinequizeapp.dbutil.DBConnection;
import onlinequizeapp.pojo.ExamPojo;
import onlinequizeapp.pojo.QuestionPojo;
import onlinequizeapp.pojo.QuestionStore;

/**
 *
 * @author bikrant bikram
 */
public class QuestionDAO 
{
public static void  addToDatabase(QuestionStore obj) throws SQLException
{
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Insert into questions values(?,?,?,?,?,?,?,?,?)");  
    ArrayList<QuestionPojo> al=obj.getAllQuestion();
    
for(QuestionPojo temp: al)
{
    ps.setString(1, temp.getExamId());
    ps.setInt(2,temp.getQno());
     ps.setString(3, temp.getQuestion());
     ps.setString(4, temp.getOption1());
     ps.setString(5, temp.getOption2());
     ps.setString(6, temp.getOption3());
     ps.setString(7, temp.getOption4());
     ps.setString(8, temp.getCorrectAnswer());
     ps.setString(9, temp.getLanguage());
     ps.executeUpdate();  
}     
}

public static QuestionStore getQuestions(ExamPojo obj) throws SQLException//not sir
{
    QuestionStore q= new QuestionStore();
    
    
    
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps= conn.prepareStatement("Select * from questions where examid= ? and  language =? order by qno");
    
    ps.setString(1, obj.getExamId());
    ps.setString(2,obj.getLanguage());
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
        QuestionPojo questionPojo= new QuestionPojo(rs.getString(1),rs.getInt(2),rs.getString(9),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(3));
        System.out.println(questionPojo);
        q.addQuestions(questionPojo);
    }
    return q;
    
}
public static boolean editQuestion(QuestionStore obj) throws SQLException
{
    boolean rtrn=false;  
    
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("update questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=? where examid=? and qno=? and language=?");  
    
    ArrayList<QuestionPojo> al=obj.getAllQuestion();
for(QuestionPojo temp: al)
{
    ps.setString(7, temp.getExamId());
    ps.setInt(8,temp.getQno());
     ps.setString(1, temp.getQuestion());
     ps.setString(2, temp.getOption1());
     ps.setString(3, temp.getOption2());
     ps.setString(4, temp.getOption3());
     ps.setString(5, temp.getOption4());
     ps.setString(6, temp.getCorrectAnswer());
     ps.setString(9, temp.getLanguage());
     ps.executeUpdate();
     rtrn=true;
     
}         
    return rtrn;
    
    
}
    
    
    
}
