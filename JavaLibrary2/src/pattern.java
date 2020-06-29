
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class pattern {

    public static void main(String[] args) 
    {
        System.out.println(KeyEvent.VK_A);
    }
    public static void  pattern()
    {
      for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("*");
            
            System.out.println("");
        }        
            
    }
     public static void  pattern1()
    {
        String a="ABCDE";
      for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(a.charAt(i));           
            System.out.println("");
        }        
          
        
        
    }
      public static void  pattern2()
    {
      for(int i=0;i<5;i++)
        {
            for(int j=5-i;j>0;j--)
                System.out.print("*");
            
            System.out.println("");
        }        
          
        
        
    } 
      public static void student()
      {
          Scanner kb= new Scanner(System.in);
          System.out.println("enetr name");
           kb.next();
          
          String name=kb.nextLine();
          System.out.println("enetr age");
          String age =kb.next();
          System.out.println("enter enrollment");
          String enrollment=kb.next();
          System.out.println(name+"\n"+ age+"\n"+ enrollment);     
          
          
      }
        public static void vowel()
      {
          Scanner kb= new Scanner(System.in);
          System.out.println("enetr string");
          
         
          String v =kb.next();
          for(int i=0;i<v.length();i++)
          {
              String oj=v.charAt(i)+"";
              
              if(oj.equalsIgnoreCase("a")||oj.equalsIgnoreCase("e")||oj.equalsIgnoreCase("i")||oj.equalsIgnoreCase("o")||oj.equalsIgnoreCase("u"))
              {
                  System.out.println(oj);  
              }
        
              
          }
          
          
      }
      
     
          
        
        
   
    
}
