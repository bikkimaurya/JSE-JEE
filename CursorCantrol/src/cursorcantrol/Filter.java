/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursorcantrol;

import com.googlecode.javacpp.Loader;
import com.googlecode.javacv.cpp.opencv_core;
import static com.googlecode.javacv.cpp.opencv_core.CV_FILLED;
import static com.googlecode.javacv.cpp.opencv_core.CV_RGB;
import static com.googlecode.javacv.cpp.opencv_core.CV_WHOLE_SEQ;
import com.googlecode.javacv.cpp.opencv_core.CvMemStorage;
import com.googlecode.javacv.cpp.opencv_core.CvScalar;
import com.googlecode.javacv.cpp.opencv_core.CvSeq;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_core.cvCircle;
import static com.googlecode.javacv.cpp.opencv_core.cvCreateImage;
import static com.googlecode.javacv.cpp.opencv_core.cvDrawContours;
import static com.googlecode.javacv.cpp.opencv_core.cvInRangeS;
import static com.googlecode.javacv.cpp.opencv_core.cvPoint;
import static com.googlecode.javacv.cpp.opencv_core.cvReleaseImage;
import static com.googlecode.javacv.cpp.opencv_core.cvScalar;
import static com.googlecode.javacv.cpp.opencv_core.cvSize;
import com.googlecode.javacv.cpp.opencv_highgui;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_CAP_ANY;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_CAP_PROP_FRAME_HEIGHT;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_CAP_PROP_FRAME_WIDTH;
import static com.googlecode.javacv.cpp.opencv_highgui.cvCreateCameraCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvQueryFrame;
import static com.googlecode.javacv.cpp.opencv_highgui.cvReleaseCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSetCaptureProperty;
import static com.googlecode.javacv.cpp.opencv_highgui.cvShowImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvWaitKey;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_BGR2HSV;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_LINK_RUNS;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_RETR_LIST;
import com.googlecode.javacv.cpp.opencv_imgproc.CvMoments;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvContourArea;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvCvtColor;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvFindContours;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvGetCentralMoment;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvGetSpatialMoment;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvMoments;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 *
 * @author bikrant bikram
 */
public class Filter {
    public static int t;
    public static IplImage filter(IplImage img,IplImage imghsv,IplImage imgbin,CvScalar min,CvScalar max,CvSeq contour1,CvSeq contour2,CvMemStorage storage,CvMoments moment,int blue,int green) throws AWTException
    {
        
        double areaMax,areaC=0,m01,m10,m_area;
        int X=0;
        int Y=0;
        Robot robot= new Robot();
        
        
        
        cvCvtColor(img,imghsv,CV_BGR2HSV);
  
        cvInRangeS(imghsv,min,max,imgbin);
        cvShowImage("bi",imgbin);
        areaMax = 1000;
        
        
        
         cvFindContours(imgbin,storage,contour1,Loader.sizeof(opencv_core.CvContour.class),CV_RETR_LIST,CV_LINK_RUNS,cvPoint(0,0));
         
         contour2= contour1;
        while(contour1!=null && !contour1.isNull())
        {
           areaC= cvContourArea(contour1,CV_WHOLE_SEQ,1) ;
           if(areaC>areaMax)
               areaMax= areaC;
           contour1=contour1.h_next();
          //  System.out.println("ghjkl");
            
            
        }
           // System.out.println("pike");
         while(contour2!=null && !contour2.isNull())
         {
             
            areaC= cvContourArea(contour2,CV_WHOLE_SEQ,1) ;
           if(areaC<areaMax)
           {
              cvDrawContours(imgbin,contour2,CV_RGB(0,0,0),CV_RGB(0,0,0),0,CV_FILLED,8,cvPoint(0,0)); 
           }
             //  System.out.println("222222");
           contour2=contour2.h_next();
         }
         
         
         cvMoments(imgbin,moment,1);
         
         m10= cvGetSpatialMoment(moment,1,0);
         m01= cvGetSpatialMoment(moment,0,1);
         m_area= cvGetCentralMoment(moment,0,0);
         
         X= (int)(m10/m_area);
         Y= (int)(m01/m_area);
         
         if( blue==1 && X>=0 && Y>=0 )
         {
             System.out.println("coadinates are" + X+"  :  "+ Y);
             
             
             robot.mouseMove(X*4, Y*4);   
             
         }
          if( green == 1 && X>=0 && Y>=0 )
         {
             System.out.println("");
             System.out.println("coadinates are" + X+"  :  "+ Y);
             
             robot.mousePress(InputEvent.BUTTON1_MASK);
             t++;
         }
          else if(t>0)
          {
              System.out.println("else chala");
              robot.mouseRelease(InputEvent.BUTTON1_MASK);
          }
        
       
       
        
        
        return imgbin;
        
    }
    
}
