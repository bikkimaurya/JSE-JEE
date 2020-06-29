
package twowaychat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

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
        
            System.out.println("server Waiting for client");
            s=sc.accept(); 
           System.out.println("request has been accepted :"+ s);
          
            Scanner ser = new Scanner(s.getInputStream());
            PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
            Scanner key= new Scanner(System.in);
           
           while(1!=0)
           {
                
             String n=ser.nextLine();
             if(n.equalsIgnoreCase("quit"))break;
              System.out.println(s.getInetAddress()+"Client:"+n);
                System.out.print(s.getInetAddress()+"Server:"); 
                pw.println(key.nextLine());
            
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
                            System.out.println("Server closed");
                        }
                    catch(Exception ex)
                    {
                        
                        ex.printStackTrace();
                        }
            
                    if(s!=null)
                        try{
                            s.close();
                            System.out.println("Socket closed");
                        }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                        
                        }
   
                    
                    
                    }   
    }
}
