/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import static com.googlecode.javacv.cpp.opencv_core.IPL_DEPTH_8U;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_core.cvCreateImage;
import static com.googlecode.javacv.cpp.opencv_core.cvSize;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_CAP_ANY;
import com.googlecode.javacv.cpp.opencv_highgui.CvCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvCreateCameraCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvDestroyWindow;
import static com.googlecode.javacv.cpp.opencv_highgui.cvQueryFrame;
import static com.googlecode.javacv.cpp.opencv_highgui.cvReleaseCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvShowImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvWaitKey;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_BGR2GRAY;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvCvtColor;

/**
 *
 * @author bikrant bikram
 */
public class ImageProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
       
        CvCapture capture= cvCreateCameraCapture(CV_CAP_ANY);
        IplImage image;
        IplImage imageGray = cvCreateImage(cvSize(640,480),IPL_DEPTH_8U,1);
        
        
        while(1!=0)
        {
          image= cvQueryFrame(capture)  ;
          cvCvtColor(image,imageGray,CV_BGR2GRAY);
          
          cvShowImage("video",imageGray);
          char ch = (char)cvWaitKey(15);
            System.out.println((int)ch);
          if(ch==27|| ch==13|| ch==32) break;  
            
        }
        
        cvReleaseCapture(capture);
        
        cvDestroyWindow("video");
    
    }
    
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    
    }
}
