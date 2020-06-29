
import java.awt.Point;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;



public class imgProsessing
{
   public static void main( String[] args ) {
   
      try{
         System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
         Mat source = Highgui.imread("digital_image_processing.jpg",  Highgui.CV_LOAD_IMAGE_COLOR);
         Mat destination = new Mat(source.rows(),source.cols(), source.type());  
         
         Core.putText(source, "Tutorialspoint.com", new Point  (source.rows()/2,source.cols()/2), Core.f,new Double(1),new  Scalar(255));

         Highgui.imwrite("watermarked.jpg", source);
         
      } catch (Exception e) {
         System.out.println("Error: "+e.getMessage());
      }
   }
}











    }
    
 
    
}