/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkingdemo;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bikrant bikram
 */
public class ClientDemo  {


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
            String sb= key.nextLine();
//             pw.println(sb);
             
             System.out.println("enter 2 no.");
             System.out.print(s.getInetAddress()+"Client:");
             int a= key.nextInt();
             pw.println(a);
             System.out.print(s.getInetAddress()+"Client:");
             int b=key.nextInt();
             pw.println(b);
//              pw.flush();
//              if(sb.equalsIgnoreCase("quit")==true)break;
              if(a==-1 || b==-1)break;
//              int q=0;
//              while(++q<5){
//                  System.out.print(".");
//                  sleep(600);
//                        
//              }
                  
//              System.out.println(".msg sent"); 
  
              String msg= serv.nextLine();
//              String msgadd= serv.nextLine();
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
   