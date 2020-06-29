package networkingdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author bikrant bikram
 */
public class Demo {

    public static void main(String[] args) throws UnknownHostException 
    {
              InetAddress inetAddress=   InetAddress.getLocalHost();
            System.out.println("ip address is");
            System.out.println(                inetAddress.getHostAddress());
           
        
    }
}
    

