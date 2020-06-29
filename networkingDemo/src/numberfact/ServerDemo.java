
package numberfact;

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
            Scanner key= new Scanner(System.in);
           
           while(1!=0)
           {
 
             int n1=ser.nextInt();
              if(n1==-1)break;

              System.out.print(s.getInetAddress()+"Client:");
                System.out.println(n1);
                int ans=1;
                for(int i=1;i<=n1;i++)
                    ans=ans*i;
                 pw.println(ans);
                
            
            
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
