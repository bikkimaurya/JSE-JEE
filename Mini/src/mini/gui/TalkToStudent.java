
package mini.gui;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mini.dao.BusManagementDao;
import mini.dao.RoutDao;
import mini.pojo.BusManagementPojo;
import mini.pojo.RoutInfoPojo;

/**
 *
 * @author bikrant bikram
 */
public class TalkToStudent extends Thread
{
   ServerSocket sc=null;
        Socket s=null;
        public void run()
        {
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
                RoutInfoPojo obj=null;
                String n=null;
if(ser!=null)     {     n=ser.nextLine();}
             if(n.equalsIgnoreCase("quit"))break;
              System.out.println(s.getInetAddress()+"Client:"+n);
              String msg="no such command";
              if(n.equalsIgnoreCase("GetRoutByName"))
              {
                  pw.println("enter rout");
                  
                   n=ser.nextLine();
                   System.out.println(n);
                 try {
                   obj=  RoutDao.getRoutByName(n);
                 } catch (SQLException ex) {
                     ex.printStackTrace();
                     Logger.getLogger(TalkToStudent.class.getName()).log(Level.SEVERE, null, ex);
                 }
                if(obj!=null)
                {
                    pw.println(obj.toString());
                  
                }     
              }
              else  if(n.equalsIgnoreCase("getallarrangement"))
              {
                 ArrayList <BusManagementPojo> al = new ArrayList<>();
                    try {
                        al= BusManagementDao.getAll();
                        for(BusManagementPojo o:al)
                        {
                            pw.println(o.toString());
                           
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        Logger.getLogger(TalkToStudent.class.getName()).log(Level.SEVERE, null, ex);
                    }
              }
              else  if(n.equalsIgnoreCase("getbusbyrout"))
              {
                   pw.println("enter rout no");
                   String stop=ser.nextLine();
                   BusManagementPojo o=BusManagementDao.getRoutByNo(Integer.parseInt(stop));
                   
                   if(o!=null)pw.println(o.toString());
                   
                 
              }
       
              else
                  pw.println(msg);
              
                System.out.print(s.getInetAddress()+"Server:is "); 
                
            
            }
            
            
        } 
        catch (SQLException ex) {
                ex.printStackTrace();
           Logger.getLogger(TalkToStudent.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch (IOException ex) {
            ex.printStackTrace();
            } 
        catch (Exception ex) {
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
