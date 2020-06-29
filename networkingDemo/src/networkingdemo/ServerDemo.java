/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkingdemo;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bikrant bikram
 */
public class ServerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ServerSocket sc=null;
        Socket s=null;
        try {
            sc = new ServerSocket(1235);
        
            System.out.println("server Waiting for clint");
            s=sc.accept(); 
           System.out.println("request has been accepted :"+ s);
          
            Scanner ser = new Scanner(s.getInputStream());
            PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
            Scanner key= new Scanner(System.in);
           
           while(1!=0)
           {
               int q=0;
                
//             String n=ser.nextLine();
             int n1=ser.nextInt();
             int n2=ser.nextInt();
 //           if(n.equalsIgnoreCase("quit"))break;
 if(n1==-1 || n2==-1)break;
              System.out.print(s.getInetAddress()+"Client:");
                System.out.println(n1+","+n2);
//                System.out.print(s.getInetAddress()+"Server:");    
//              int ans=1; 
//              
//for(int i=1;i<=n1;i++)
//    
//ans=ans*i;





             pw.println(n1+n2);
//             pw.println(n1+n2);
//             pw.flush()  ;
//             while(++q<5){
//                  System.out.print(".");
//                  sleep(600);
//                        
//              }
//               System.out.println("sent");
            
            }
            
            
        } 
        catch (IOException ex) {
            ex.printStackTrace();
            }
        
            
            finally
        {
            if(sc!=null)
                        try{
                            sc.close();
                            System.out.println("sc losed");
                        }
                    catch(Exception ex)
                    {
                        
                        ex.printStackTrace();
                        }
            
                    if(s!=null)
                        try{
                            s.close();
                            System.out.println("sdfgjkgkjk");
                        }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                        
                        }
   
                    
                    
                    }   
    }
    
}
