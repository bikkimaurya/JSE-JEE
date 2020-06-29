
package numberfact;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author bikrant bikram
 */
public class ClientDemo {
     public static void main (String[] args) 
    {
     
        Socket s=null;
        try {
           

         
             s=new Socket("MAURYA",1235) ;

           Scanner serv = new Scanner(s.getInputStream());//for getting input from server
           PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
           Scanner key = new Scanner(System.in); 

         while(1!=0)
             
         {
             System.out.print(s.getInetAddress()+"Client:");

             System.out.println("enter 1 no.");
             System.out.print(s.getInetAddress()+"Client:");
             int a= key.nextInt();
             pw.println(a);           
              if(a==-1 )break; 
              String msg= serv.nextLine();
              System.out.println(s.getInetAddress()+"Server:"+msg/*+msgadd*/);       
         }            
        } 
        catch (IOException ex) {
           ex.printStackTrace();
            }

                    if(s!=null)
                        try{
                            s.close();
                            System.out.println("socket closed");
                        }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                        
                        }
    }
    
}
