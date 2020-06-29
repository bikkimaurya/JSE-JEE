/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import com.googlecode.javacv.cpp.opencv_core.CvScalar;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_core.cvCreateImage;
import static com.googlecode.javacv.cpp.opencv_core.cvGetSize;
import static com.googlecode.javacv.cpp.opencv_core.cvInRangeS;
import static com.googlecode.javacv.cpp.opencv_core.cvReleaseImage;
import static com.googlecode.javacv.cpp.opencv_core.cvScalar;
import static com.googlecode.javacv.cpp.opencv_core.cvSize;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_CAP_ANY;
import com.googlecode.javacv.cpp.opencv_highgui.CvCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvCreateCameraCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvQueryFrame;
import static com.googlecode.javacv.cpp.opencv_highgui.cvReleaseCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvShowImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvWaitKey;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_BGR2HSV;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvCvtColor;

/**
 *
 * @author bikrant bikram
 */
public class ColorFilteringJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IplImage img1,imghsv,imgbin;
        CvCapture capture= cvCreateCameraCapture(CV_CAP_ANY);
         CvScalar min=cvScalar(50,50,50,0);
        CvScalar max=cvScalar(255,255,255,0);
        
        
       
        
       
        while(1!=0)
        {
          img1= cvQueryFrame(capture)  ;
          
          
            if(img1==null)break;
             imghsv= cvCreateImage(cvGetSize(img1),8,3);
        imgbin= cvCreateImage(cvGetSize(img1),8,1);
       
        
        cvCvtColor(img1,imghsv,CV_BGR2HSV);
       
        cvInRangeS(imghsv,min,max,imgbin);
        cvShowImage("COlor",img1);
        cvShowImage("hsv",imghsv);
        cvShowImage("binary",imgbin);
        char ch= (char)cvWaitKey(30);
        
        if(32==ch)
        { cvReleaseImage(img1);
       cvReleaseImage(imghsv);
       cvReleaseImage(imgbin);
            break;
        
         }
      
      
          
        
    } cvReleaseCapture(capture);
    }
}

    

