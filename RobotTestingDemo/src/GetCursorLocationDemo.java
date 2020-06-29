
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;


public class GetCursorLocationDemo implements NativeKeyListener
{
static int l=786786;
static int r=786786;

    public static void main(String[] args) throws IOException, InterruptedException, AWTException 
    {
    try {
        ArrayList <Integer> x= new ArrayList<>();
        ArrayList <Integer> y= new ArrayList<>();
        
        ArrayList <Integer> left= new ArrayList<>();
        ArrayList <Integer> right= new ArrayList<>();

        GlobalScreen.registerNativeHook(); 
        
       GlobalScreen.addNativeKeyListener(new GetCursorLocationDemo());
        Robot robo= new Robot();
        int xc ;
        int yc;
        
        while(true)
        {
            x.add(xc=MouseInfo.getPointerInfo().getLocation().x);
            y.add(yc=MouseInfo.getPointerInfo().getLocation().y);
            sleep(60);
            
            left.add(l);
            right.add(r);
            
            
            
            
            
            
            System.out.println(xc+":"+yc+" "+l+" "+ r);
            l=r=786786;
            
            
            if(xc==0 && yc==0)break;
        }
        int t=0;
        while(t<x.size())
        {
            xc= x.get(t);
            yc=y.get(t);
            t++;
            System.out.println(xc+":"+yc);
            
            robo.mouseMove(xc, yc);
            sleep(60);
            
        }
        } catch (NativeHookException ex) {
            System.out.println("exeception");
        Logger.getLogger(GetCursorLocationDemo.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    } 

    

 

    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {
        System.out.println(nke.getKeyChar());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
class Demo1 extends Thread
{
public void run()
{
    while(true                     )
            {
    try {
       int key=System.in.read();
  
       if(key==32)
           GetCursorLocationDemo.l=key;
       

    } catch (IOException ex) {
        ex.printStackTrace();
       
    }
  
    
            } 
    
}
    
    
} 
class Demo2 extends Thread
{
public void run()
{
    while(true)
    {
    try {
       int key=System.in.read();
             System.out.println("run1");                                 
       if(key==9)
           GetCursorLocationDemo.r=key;
       

    } catch (IOException ex) {
        ex.printStackTrace();
       
    }
  
    
    
    }
    
}
    
    
} 