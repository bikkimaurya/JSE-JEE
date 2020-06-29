
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.sql.DriverManager.println;
import java.util.Scanner;

/**
 *
 * @author bikrant bikram
 */
public class CompilorDemo {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        
        try { 
            String [] d= {"cmd /c cd..","cd..", "cd..","cd..","cd..", "cd users ","cd abhishek maurya"," cd desktop "," cd compilordemo ","notepad hello.py"};
//        Process p= new ProcessBuilder("g++ hello.cpp").start();
           
            File f = new File("C:\\Users\\abhishek maurya\\Documents\\NetBeansProjects\\RobotTestingDemo\\hello.py"); 
            PrintWriter pw= new PrintWriter(f);
            pw.println("print('hello anant');");
            pw.close();
          Process p= Runtime.getRuntime().exec("cmd /c "+ "g++ hello.cpp");
        // q= Runtime.getRuntime().exec("g++ hello.cpp");
          
//          Runtime.getRuntime().exec("cd..");
//           Runtime.getRuntime().exec("cd..");
//           Runtime.getRuntime().exec("cd..");
//        
//       
//    String l;   Scanner sc= new Scanner(p.getInputStream());
//    
//    
//    while((l=sc.nextLine())!=null)
//    
//                System.out.println(l);
//
//           

 BufferedReader b= new BufferedReader(new InputStreamReader(p.getInputStream())) ;
  BufferedReader c= new BufferedReader(new InputStreamReader(p.getErrorStream())) ;
   BufferedWriter e= new BufferedWriter(new OutputStreamWriter(p.getOutputStream())) ;
 
while(true)
{

    boolean in = false;
    
   
         String a;
           while((a=b.readLine())!=null) 
           { 
              in = true;
               System.out.println(a);
           }
          
         
           while((a=c.readLine())!=null) 
           {
               in =true;
               System.out.println(a);
           }
          
          
           if(in==false)
           {
               System.out.println("Enter your input");  
               e.write(kb.nextLine());
               e.flush();

           }
           System.out.println("first loop cmpleted");
           
           
    
        } 
        }
        
        catch (Exception ex) {
            System.out.println("error");
            ex.printStackTrace();
    }   
    
}
}
