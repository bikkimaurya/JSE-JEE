
package numberadd;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerDemo {
    
    public static void main(String[] args) 
    {
        ServerSocket sc=null;
        Socket s=null;
        try {
            sc = new ServerSocket(1235);
        
            System.out.println("server Waiting for clint");
            s=sc.accept(); 
           System.out.println("request has been accepted :"+ s);
          
            Scanner ser = new Scanner(s.getInputStream());
            PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
            
           
           while(1!=0)
           {
               int q=0;
                

             int n1=ser.nextInt();
             int n2=ser.nextInt();
             if(n1==-1 || n2==-1)break;
             
 
              System.out.print(s.getInetAddress()+"Client:");
                System.out.println(n1+","+n2);

             pw.println(n1+n2);

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
                            System.out.println("Socket closed successfully");
                        }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                        
                        }                   
                    }   
    }
    
}
