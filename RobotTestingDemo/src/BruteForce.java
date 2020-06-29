
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
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
public class BruteForce {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("C:\\Users\\abhishek maurya\\Desktop\\PossiblePasswords.txt");
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            for(char i=20;i<127;i++)
            {
                if(a==1)pw.println(i);
                else
                {
                  for(char j=20;j<127;j++)
            {
                if(a==2)pw.println(""+i+j);
                else
                {
                  for(char k=20;k<127;k++)
            {
                if(a==3)pw.println(""+i+""+j+""+k);
                else
                {
                   for(char l=20;l<127;l++)
            {
                if(a==4)pw.println(""+(char)i+""+(char)j+""+(char)k+""+(char)l);
                else
                {
                   for(int m=20;m<127;m++)
            {
                if(a==5)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m);
                else
                {
                    for(int n=20;n<127;n++)
            {
                if(a==6)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m+(char)n);
                else
                {
                  for(int o=20;o<127;o++)
            {
                if(a==7)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m+(char)n+(char)o);
                else
                {
                  for(int p=20;p<127;p++)
            {
                if(a==8)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m+(char)n+(char)o+(char)p);
                else
                {
                   for(int q=20;q<127;q++)
            {
                if(a==9)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m+(char)n+(char)o+(char)p+(char)q);
                else
                {
                   for(int r=20;r<127;r++)
            {
                if(a==10)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m+(char)n+(char)o+(char)p+(char)q+(char)r);
                else
                {
                    for(int s=20;s<127;s++)
            {
                if(a==11)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m+(char)n+(char)o+(char)p+(char)q+(char)r+(char)s);
                else
                {
                  for(int t=20;t<127;t++)
            {
                if(a==12)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m+(char)n+(char)o+(char)p+(char)q+(char)r+(char)s+(char)t);
                else
                {
                    for(int u=20;u<127;u++)
            {
                if(a==13)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m+(char)n+(char)o+(char)p+(char)q+(char)r+(char)s+(char)t+(char)u);
                else
                {
                   for(int v=20;v<127;v++)
            {
                if(a==14)pw.println(""+(char)i+(char)j+(char)k+(char)l+(char)m+(char)n+(char)o+(char)p+(char)q+(char)r+(char)s+(char)t+(char)u+(char)v);
                else
                {
                    
                }
                
            } 
                }
                
            }
                }
                
            }  
                }
                
            }
                }
                
            } 
                }
                
            } 
                }
                
            }  
                }
                
            }  
                }
                
            }
                }
                
            } 
                }
                
            } 
                }
                
            }  
                }
                
            }  
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BruteForce.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
