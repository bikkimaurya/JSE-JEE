
package networkingdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bikrant bikram
 */
public class NetworkingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=   InetAddress.getLocalHost();
           System.out.println("ip address is");
           System.out.println(                inetAddress.getHostAddress());
        
        
        
        
        
        
        
    }
    
}
