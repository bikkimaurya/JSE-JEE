/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import com.googlecode.javacpp.Loader;
import com.googlecode.javacv.cpp.opencv_core;
import static com.googlecode.javacv.cpp.opencv_core.CV_FILLED;
import static com.googlecode.javacv.cpp.opencv_core.CV_RGB;
import static com.googlecode.javacv.cpp.opencv_core.CV_WHOLE_SEQ;
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

/**
 *
 * @author bikrant bikram
 */
public class MomentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        opencv_core.IplImage img1,imghsv,imgbin;
        opencv_highgui.CvCapture capture= cvCreateCameraCapture(CV_CAP_ANY);
        cvSetCaptureProperty(capture,CV_CAP_PROP_FRAME_WIDTH,640);
        cvSetCaptureProperty(capture,CV_CAP_PROP_FRAME_HEIGHT,480);
        
        opencv_core.CvScalar min=cvScalar(40,150,75,0);//for red 145,255,255,190,255,255
        opencv_core.CvScalar max=cvScalar(80,255,255,0);
       
        opencv_core.CvSeq contour2;
        opencv_core.CvMemStorage storage= opencv_core.CvMemStorage.create();
        double areaMax,areaC=0,m01,m10,m_area;
        imghsv= cvCreateImage(cvSize(640,480),8,3);
        imgbin= cvCreateImage(cvSize(640,480),8,1);
        CvMoments moment = new CvMoments(Loader.sizeof(CvMoments.class));
        int X=0;
        int Y=0;
        
        
    
        
        
        while(1!=0)
        {
            //System.out.println("dubara");
            img1= cvQueryFrame(capture)  ;
          

            if(img1==null)break;
     
        cvCvtColor(img1,imghsv,CV_BGR2HSV);
  
        cvInRangeS(imghsv,min,max,imgbin);
        cvShowImage("bi",imgbin);
        areaMax = 1000;
     
        opencv_core.CvSeq contour1= new opencv_core.CvSeq();
if(imgbin==null || contour1==null||storage==null )continue;
        
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
         if(X>=0 && Y>=0 )
         {
             System.out.println("coadinates are" + X+"  :  "+ Y);
         }
         
         cvCircle(img1,cvPoint(X,Y),5,cvScalar(0,255,0,0),9,0,0);
         
         

                cvShowImage("real",img1);
                cvShowImage("hsv",imghsv);
                cvShowImage("binary",imgbin);


//      
//         System.out.println(" aur bahr");
//        
//  
//            System.out.println("aur aur bahar");
              char ch = (char)cvWaitKey(30);
       if(32  == ch)
       {break;
    
       } 
        
    }
         cvReleaseCapture(capture);
         cvReleaseImage(img1);
        cvReleaseImage(imgbin);
    }
}
    
   
        
        
        
    
    
    


    
    

