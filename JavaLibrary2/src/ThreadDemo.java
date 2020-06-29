
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;



class Printer 
{
   private void print(String msg)
   {
       
      
       try {
           System.out.println("["+ msg); 
           
           
           sleep(100);
           System.out.println("]");
       }
       catch (InterruptedException ex) 
       {
           Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
       }
      
       
       
   }
   
}
class TreadDemo implements Runnable
{
    
    
    
    
    
    public void run()
    {
        
        
        
    }
    
    
    
}
