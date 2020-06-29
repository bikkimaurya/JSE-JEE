
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
public class GetWebIp 
{
    public static void main(String[] args) throws IOException {
        
        try {
            Scanner kb= new Scanner(System.in);
                    
                    System.out.println("ENetr ");
            InetAddress [] inetAddress=InetAddress.getAllByName(kb.next());
            System.out.println(inetAddress.length);
            for( InetAddress a: inetAddress)
             System.out.println( a.getHostAddress());
            
                    } catch (UnknownHostException ex) {
            Logger.getLogger(NetworkingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}
