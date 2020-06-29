
package CantrolConnectivity;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;

/**
 *
 * @author bikrant bikram
 */
public class ClientDemo implements NativeKeyListener ,NativeMouseListener {
    
/**
 *
 * @author bikrant bikram
 */

   static PrintWriter pw1=null;
   static PrintWriter pw2=null;
  static ArrayList<String> k= new ArrayList<>();
   static ArrayList<Integer> x= new ArrayList<>();
   static ArrayList<Integer> y= new ArrayList<>();
   static ArrayList<Integer> n= new ArrayList<>();
   static ArrayList<Integer> xmove= new ArrayList<>();
   static ArrayList<Integer> ymove= new ArrayList<>();
   static String kpass= "kuchnahi";
    static    int xpass,ypass,nkey;
    
    
    
    public static void main(String[] args) throws FileNotFoundException {
        File fl= new File("C:\\Users\\abhishek maurya\\Desktop\\Demo.txt");
        File f2= new File("C:\\Users\\abhishek maurya\\Desktop\\Mouse.txt");
        
       pw1 = new PrintWriter(fl);
       pw2 = new PrintWriter(f2);
      
       
       
        
        try {
             Socket sc= new Socket("MAURYA",1235);
             PrintWriter pw= new PrintWriter(sc.getOutputStream(),true);
             
                         Robot robo= new Robot();
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeKeyListener(new ClientDemo());
            GlobalScreen.addNativeMouseListener(new ClientDemo());
            
            while(true)
            {
              kpass="kuchhnahi";
              xpass=ypass=786;
              sleep(50);              
              k.add(kpass);
              pw.println(kpass);//keyStrokes
              
              x.add(xpass);
              pw.println(xpass);//mouse stroke
              y.add(ypass);
              pw.println(ypass);//mouse stroke
              n.add(nkey);
              pw.println(nkey);
              xmove.add(MouseInfo.getPointerInfo().getLocation().x);
              pw.println(MouseInfo.getPointerInfo().getLocation().x);//mouse move to x
              ymove.add(MouseInfo.getPointerInfo().getLocation().y);
              pw.println(MouseInfo.getPointerInfo().getLocation().y);//mouse move to y
              
              if(kpass.equalsIgnoreCase("escape"))
                  break;
            }
            
                
            System.exit(0); 
        } catch (NativeHookException ex) {
            System.out.println("exception occuref v ");
            
        } catch (AWTException ex) {
           Logger.getLogger(ClientDemo.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InterruptedException ex) {
           Logger.getLogger(ClientDemo.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(ClientDemo.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {
//        System.out.println("dftgyhuiojkjsfhrgudhgbgdgruyghuyrgfffffffffffffffygggggggggggggggggggggggggg");
//        String  ch;
//        
//        ch=NativeKeyEvent.getKeyText(nke.getKeyCode());
//        
//       pw.append(ch);
//       System.out.println(ch);
//       if(ch.equalsIgnoreCase("space"))
//       {
//           pw.flush();
//           pw.close();
//           System.exit(0);
//       }
//       pw.flush();
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
      System.out.println("dftgyhuiojkjsfhrgudhgbgdgruyghuyrgfffffffffffffffygggggggggggggggggggggggggg");
        String  ch;
//        nkey=nke.getKeyCode();
         kpass=ch=NativeKeyEvent.getKeyText(nke.getKeyCode());
        pw1.println(ch);
//        pw1.println(nkey);
//       pw1.append(ch);
//       pw1.append("\n");
//       System.out.println(ch);
       if(ch.equalsIgnoreCase("escape"))
       {
           pw1.flush();
           pw1.close();
           pw2.close();
          // System.exit(0);
       }
       pw1.flush();
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
//           System.out.println("dftgyhuiojkjsfhrgudhgbgdgruyghuyrgfffffffffffffffygggggggggggggggggggggggggg");
//        String  ch;
//     ch=NativeKeyEvent.getKeyText(nke.getKeyCode());
//        
//       pw.append(ch);
//       System.out.println(ch);
//       if(ch.equalsIgnoreCase("space"))
//       {
//           pw.flush();
//           pw.close();
//           System.exit(0);
//       }
//       pw.flush();
    }
    @Override
    public void nativeMouseClicked(NativeMouseEvent nme) {
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
//        String ch=nme.getButton()+nme.getX()+":"+nme.getY();
//        
//        System.out.println(ch);
//        pw2.append(ch);
      
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent nme) {
     String ch=nme.getButton()+"====="+nme.getX()+":"+nme.getY();
         pw2.println(ch);
         ypass=nme.getY();
         xpass=nme.getX();       
        System.out.println(ch);
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent nme) {
//     String ch=nme.getButton()+nme.getX()+":"+nme.getY();
//         pw2.append(ch);
//        System.out.println(ch);
        
    }

   

}