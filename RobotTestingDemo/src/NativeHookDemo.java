import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
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
public class NativeHookDemo implements NativeKeyListener ,NativeMouseListener{
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
                         Robot robo= new Robot();
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeKeyListener(new NativeHookDemo());
            GlobalScreen.addNativeMouseListener(new NativeHookDemo());
            
            while(true)
            {
              kpass="kuchhnahi";
              xpass=ypass=786;
              sleep(50);              
              k.add(kpass);
              x.add(xpass);
              y.add(ypass);
              n.add(nkey);
              xmove.add(MouseInfo.getPointerInfo().getLocation().x);
              ymove.add(MouseInfo.getPointerInfo().getLocation().y);
              
              if(kpass.equalsIgnoreCase("escape"))
                  break;
            }
            int b=0;

            int c=0;
            while(c++<=0){
            while(b<x.size())
            {
                sleep(50);
                System.out.println(x.get(b)+y.get(b));
                robo.mouseMove(xmove.get(b),ymove.get(b));
                if(x.get(b)!=786|| y.get(b)!=786)
                {
                   robo.mousePress(InputEvent.BUTTON1_MASK);
                   robo.mouseRelease(InputEvent.BUTTON1_MASK);
                    System.out.println("enetr chala123121212");
                    
                }
                
                   
                if(k.get(b).equalsIgnoreCase("space")){
                    robo.keyPress(KeyEvent.VK_SPACE);
                    robo.keyRelease(KeyEvent.VK_SPACE);}
                
               
               
                else if(k.get(b).equalsIgnoreCase("ctrl"))
                {  
                    System.out.println("cantrol chala");
                    robo.keyPress(KeyEvent.VK_CONTROL);
                    if(k.get(b+1).equals("c"))
                        robo.keyPress(KeyEvent.VK_COPY);
                    else if(k.get(b+1).equals("a"))
                        robo.keyPress(KeyEvent.VK_ALL_CANDIDATES);
                    else if(k.get(b+1).equals("v"))
                        robo.keyPress(KeyEvent.VK_PASTE);
                    else if(k.get(b+1).equals("x"))
                        robo.keyPress(KeyEvent.VK_CUT);
                    
                     
                }
                 else if(k.get(b).equalsIgnoreCase("a"))
                {
                    robo.keyPress(KeyEvent.VK_A);
                    robo.keyRelease(KeyEvent.VK_A);
                }
               else if(k.get(b).equalsIgnoreCase("b")){
                   robo.keyPress(KeyEvent.VK_B);
                   robo.keyRelease(KeyEvent.VK_B);
                   
               }
                   
               else if(k.get(b).equalsIgnoreCase("c")){
                    robo.keyPress(KeyEvent.VK_C);
                    robo.keyRelease(KeyEvent.VK_C);
               }    
               else if(k.get(b).equalsIgnoreCase("D")){
                    robo.keyPress(KeyEvent.VK_D);
                    robo.keyRelease(KeyEvent.VK_D);}
               else if(k.get(b).equalsIgnoreCase("E")){
                    robo.keyPress(KeyEvent.VK_E);
                    robo.keyRelease(KeyEvent.VK_E);}
               else if(k.get(b).equalsIgnoreCase("F")){
                    robo.keyPress(KeyEvent.VK_F);
                    robo.keyRelease(KeyEvent.VK_F);}
               else if(k.get(b).equalsIgnoreCase("g")){
                    robo.keyPress(KeyEvent.VK_G);
                    robo.keyRelease(KeyEvent.VK_G);}
               else if(k.get(b).equalsIgnoreCase("H")){
                    robo.keyPress(KeyEvent.VK_H);
                    robo.keyRelease(KeyEvent.VK_H);}
               else if(k.get(b).equalsIgnoreCase("I")){
                    robo.keyPress(KeyEvent.VK_I);
                    robo.keyRelease(KeyEvent.VK_I);}
               
               else if(k.get(b).equalsIgnoreCase("J")){
                    robo.keyPress(KeyEvent.VK_J);
                    robo.keyRelease(KeyEvent.VK_J);}
               else if(k.get(b).equalsIgnoreCase("K")){
                    robo.keyPress(KeyEvent.VK_K);
                    robo.keyRelease(KeyEvent.VK_K);}
               else if(k.get(b).equalsIgnoreCase("L")){
                    robo.keyPress(KeyEvent.VK_L);
                    robo.keyRelease(KeyEvent.VK_L);}
               else if(k.get(b).equalsIgnoreCase("M")){
                    robo.keyPress(KeyEvent.VK_M);
                    robo.keyRelease(KeyEvent.VK_M);}
               else if(k.get(b).equalsIgnoreCase("N")){
                    robo.keyPress(KeyEvent.VK_N);
                    robo.keyRelease(KeyEvent.VK_N);}
               else if(k.get(b).equalsIgnoreCase("O")){
                    robo.keyPress(KeyEvent.VK_O);
                    robo.keyRelease(KeyEvent.VK_O);}
               else if(k.get(b).equalsIgnoreCase("P")){
                    robo.keyPress(KeyEvent.VK_P);
                    robo.keyRelease(KeyEvent.VK_P);}
               else if(k.get(b).equalsIgnoreCase("Q")){
                    robo.keyPress(KeyEvent.VK_Q);
                    robo.keyRelease(KeyEvent.VK_Q);}
               else if(k.get(b).equalsIgnoreCase("R")){
                    robo.keyPress(KeyEvent.VK_R);
                    robo.keyRelease(KeyEvent.VK_R);}
               
               else if(k.get(b).equalsIgnoreCase("S")){
                    robo.keyPress(KeyEvent.VK_S);
                    robo.keyRelease(KeyEvent.VK_S);}
               else if(k.get(b).equalsIgnoreCase("T")){
                    robo.keyPress(KeyEvent.VK_T);
                    robo.keyRelease(KeyEvent.VK_T);}
               else if(k.get(b).equalsIgnoreCase("U")){
                    robo.keyPress(KeyEvent.VK_U);
                    robo.keyRelease(KeyEvent.VK_U);}
                else if(k.get(b).equalsIgnoreCase("V")){
                    robo.keyPress(KeyEvent.VK_V);
                    robo.keyRelease(KeyEvent.VK_V);
                }
                
                else if(k.get(b).equalsIgnoreCase("W")){
                    robo.keyPress(KeyEvent.VK_W);
                    robo.keyRelease(KeyEvent.VK_W);
                }
                else if(k.get(b).equalsIgnoreCase("X")){
                    robo.keyPress(KeyEvent.VK_X);
                    robo.keyRelease(KeyEvent.VK_X);
                }
                else if(k.get(b).equalsIgnoreCase("Y")){
                    robo.keyPress(KeyEvent.VK_Y);
                    robo.keyRelease(KeyEvent.VK_Y);}
                else if(k.get(b).equalsIgnoreCase("Z")){
                    robo.keyPress(KeyEvent.VK_Z);
                    robo.keyRelease(KeyEvent.VK_Z);
                }
                else if(k.get(b).equalsIgnoreCase("1")){
                    robo.keyPress(KeyEvent.VK_1);
                    robo.keyRelease(KeyEvent.VK_1);}
                
                else if(k.get(b).equalsIgnoreCase("2")){
                    robo.keyPress(KeyEvent.VK_2);
                    robo.keyRelease(KeyEvent.VK_2);}
                
                else if(k.get(b).equalsIgnoreCase("3")){
                    robo.keyPress(KeyEvent.VK_3);
                    robo.keyRelease(KeyEvent.VK_3);}
                
                else if(k.get(b).equalsIgnoreCase("4")){
                    robo.keyPress(KeyEvent.VK_4);
                    robo.keyRelease(KeyEvent.VK_4);}
                
                else if(k.get(b).equalsIgnoreCase("5")){
                    robo.keyPress(KeyEvent.VK_5);
                    robo.keyRelease(KeyEvent.VK_5);}
                
                else if(k.get(b).equalsIgnoreCase("6")){
                    robo.keyPress(KeyEvent.VK_6);
                    robo.keyRelease(KeyEvent.VK_6);}
                
                else if(k.get(b).equalsIgnoreCase("7")){
                    robo.keyPress(KeyEvent.VK_7);
                    robo.keyRelease(KeyEvent.VK_7);}
                else if(k.get(b).equalsIgnoreCase("8")){
                    robo.keyPress(KeyEvent.VK_8);
                    robo.keyRelease(KeyEvent.VK_8);}
                else if(k.get(b).equalsIgnoreCase("9")){
                    robo.keyPress(KeyEvent.VK_9);
                    robo.keyRelease(KeyEvent.VK_9);}
                else if(k.get(b).equalsIgnoreCase("0")){
                    robo.keyPress(KeyEvent.VK_0);
                    robo.keyRelease(KeyEvent.VK_0);}
               
                
                
                else if(k.get(b).equalsIgnoreCase("tab")){
                    robo.keyPress(KeyEvent.VK_TAB);
                    robo.keyRelease(KeyEvent.VK_TAB);}
                else if(k.get(b).equalsIgnoreCase("caps lock")){
                    robo.keyPress(KeyEvent.VK_CAPS_LOCK);
                    robo.keyRelease(KeyEvent.VK_CAPS_LOCK);}
                else if(k.get(b).equalsIgnoreCase("enter")){
                    robo.keyPress(KeyEvent.VK_ENTER);
                    robo.keyRelease(KeyEvent.VK_ENTER);}
                else if(k.get(b).equalsIgnoreCase("backspace"))
                        {
                    robo.keyPress(KeyEvent.VK_BACK_SPACE);
                    robo.keyRelease(KeyEvent.VK_BACK_SPACE);
                        }
                else if(k.get(b).equalsIgnoreCase("shift"))
                        {
                    robo.keyPress(KeyEvent.VK_SHIFT);
                    if(k.get(b+1).equals("left"))
                        robo.keyPress(KeyEvent.VK_KP_LEFT);
                    else if(k.get(b+1).equals("right"))
                        robo.keyPress(KeyEvent.VK_KP_RIGHT);
                    
                    
                    
                        }
                else if(k.get(b).equals("left")){
                    robo.keyPress(KeyEvent.VK_KP_LEFT);
                    robo.keyRelease(KeyEvent.VK_KP_LEFT);
                }
                        
                    else if(k.get(b).equals("right")){
                        robo.keyPress(KeyEvent.VK_KP_RIGHT);
                        robo.keyRelease(KeyEvent.VK_KP_RIGHT);
                    }
                   else if(k.get(b).equals("up")){
                        robo.keyPress(KeyEvent.VK_KP_UP);
                        robo.keyRelease(KeyEvent.VK_KP_UP);
                    }
                else if(k.get(b).equals("down")){
                        robo.keyPress(KeyEvent.VK_DOWN);
                        robo.keyRelease(KeyEvent.VK_DOWN);
                    }
                if(kpass=="space")break;
                
                b++;          
            }  
             robo.keyRelease(KeyEvent.VK_SHIFT);
                robo.keyRelease(KeyEvent.VK_CONTROL);
                b=0;
            
            }
                
            System.exit(0); 
        } catch (NativeHookException ex) {
            System.out.println("exception occuref v ");
            
        } catch (AWTException ex) {
           Logger.getLogger(NativeHookDemo.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InterruptedException ex) {
           Logger.getLogger(NativeHookDemo.class.getName()).log(Level.SEVERE, null, ex);
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
