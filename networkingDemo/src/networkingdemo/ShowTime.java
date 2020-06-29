/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkingdemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bikrant bikram
 */
public class ShowTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            // TODO code application logic here
Scanner kb= new Scanner(System.in);


                    System.out.println("ENetr ");
            InetAddress [] inetAddress=InetAddress.getAllByName(kb.next());
            System.out.println(inetAddress.length);
            for( InetAddress a: inetAddress)
             System.out.println( a.getHostAddress());
            
            
            
           //InetAddress inet=InetAddress.getByName("time-c.nifc.gov");  
            
           Socket sc= new Socket("time-c.nifc.gov",13); 
           sc.getOutputStream();
           sc.getInputStream();
            System.out.println(sc.toString()); 
             System.out.println("dfghjkwww.nifc.gov");
                    
//         Scanner sb= new Scanner(sc.getOutputStream());           
                    
                    
                    } catch (UnknownHostException ex) {
            Logger.getLogger(NetworkingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
