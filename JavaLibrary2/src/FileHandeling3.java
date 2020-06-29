
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikrant bikram
 */
public class FileHandeling3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataOutputStream pr=null;
        DataInputStream br=null;
        try
        {
            FileOutputStream fr= new FileOutputStream("C:\\Users\\abhishek maurya\\Desktop\\filehandeling.java");
            FileInputStream gr= new FileInputStream("C:\\Users\\abhishek maurya\\Desktop\\filehandeling.java");
            
            pr = new DataOutputStream(fr);
            br = new DataInputStream(gr);
            pr.writeUTF("this is new file");
            try
            {
                pr.close();
            }catch(IOException ex)
            {
                System.out.println("error during closinf=g thr file");
            }
            char ch;
            System.out.println(br.readUTF());
            
            
        } catch (IOException ex) {
            System.out.println("error in io operation");
        }
        finally
        {
            try
            {
             pr.close();
             br.close();
            }
            catch(IOException ex)
            {
                System.out.println("error in closing the file");
            }
                
            }
           
    }
    
}
