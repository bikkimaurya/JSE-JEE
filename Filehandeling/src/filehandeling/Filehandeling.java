
package filehandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bikrant bikram
 */
public class Filehandeling {

    public static void main(String[] args) {
        FileReader fr= null;
        {
            try
            {
                fr=new FileReader("C:\\Users\\abhishek maurya\\Desktop\\programs\\abhi.txt");
                int  ch;
                int count=0;
                while((ch= fr.read())!=-1)
                {
                   System.out.print((char)ch);
                   ++count;
                }
                System.out.println("Total no of charcter "+ count+ " reads");
                
            }
           
            catch (FileNotFoundException ex) {
                Logger.getLogger(Filehandeling.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IOException ex)
            {
                System.out.println("Error while reading file");
            } 
              finally
            {
                if(fr!=null)
                {
                    try
                    {
                        fr.close();
                    }
                    catch(IOException ex)
                    {
                        System.out.println("Error while closing the file");    
                    }
                        
                }
            
            }
            
        }
    }
    
}
