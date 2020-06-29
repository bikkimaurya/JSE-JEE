
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikrant bikram
 */
public class filehandeling2 {
    public static void main(String[] args) {
       PrintWriter pr=null;
        try
        {
            FileWriter fr= new FileWriter("C:\\Users\\abhishek maurya\\Desktop\\filehandeling.java");
            pr = new PrintWriter(fr);
            pr.print("this is new file");
            
            
        } catch (IOException ex) {
            System.out.println("error in io operation");
        }
        finally
        {
             pr.close(); 
            }
           
                
          
           
        }
        
        
        
    }

