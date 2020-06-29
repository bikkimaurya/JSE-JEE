/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import com.googlecode.javacpp.Loader;
import static com.googlecode.javacv.cpp.opencv_core.CV_FILLED;
import static com.googlecode.javacv.cpp.opencv_core.CV_RGB;
import static com.googlecode.javacv.cpp.opencv_core.CV_WHOLE_SEQ;
import com.googlecode.javacv.cpp.opencv_core.CvContour;
import com.googlecode.javacv.cpp.opencv_core.CvMemStorage;
import com.googlecode.javacv.cpp.opencv_core.CvScalar;
import com.googlecode.javacv.cpp.opencv_core.CvSeq;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_core.cvCreateImage;
import static com.googlecode.javacv.cpp.opencv_core.cvDrawContours;
import static com.googlecode.javacv.cpp.opencv_core.cvInRangeS;
import static com.googlecode.javacv.cpp.opencv_core.cvPoint;
import static com.googlecode.javacv.cpp.opencv_core.cvReleaseImage;
import static com.googlecode.javacv.cpp.opencv_core.cvScalar;
import static com.googlecode.javacv.cpp.opencv_core.cvSize;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_CAP_ANY;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_CAP_PROP_FRAME_HEIGHT;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_CAP_PROP_FRAME_WIDTH;
import com.googlecode.javacv.cpp.opencv_highgui.CvCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvCreateCameraCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvQueryFrame;
import static com.googlecode.javacv.cpp.opencv_highgui.cvReleaseCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSetCaptureProperty;
import static com.googlecode.javacv.cpp.opencv_highgui.cvShowImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvWaitKey;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_BGR2HSV;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_LINK_RUNS;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_RETR_LIST;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvContourArea;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvCvtColor;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvFindContours;

/**
 *
 * @author bikrant bikram
 */
public class ContourDemo  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
       
        IplImage img1,imghsv,imgbin;
        CvCapture capture= cvCreateCameraCapture(CV_CAP_ANY);
        cvSetCaptureProperty(capture,CV_CAP_PROP_FRAME_WIDTH,640);
        cvSetCaptureProperty(capture,CV_CAP_PROP_FRAME_HEIGHT,480);
        
        CvScalar min=cvScalar(14,250,75,0);
        CvScalar max=cvScalar(80,255,255,0);
       
        CvSeq contour2;
        CvMemStorage storage= CvMemStorage.create();//for storing contour
        double areaMax,areaC=0;
        imghsv= cvCreateImage(cvSize(640,480),8,3);
        imgbin= cvCreateImage(cvSize(640,480),8,1);
     //   imggray= cvCreateImage(cvSize(640,480),8,1);
        
        
        while(1!=0)
        {
            System.out.println("dubara");
            img1= cvQueryFrame(capture)  ;
          
     //     img1=cvLoadImage("C:\\Users\\abhishek maurya\\Desktop\\groot.PNG");
            if(img1==null)break;
//        
//          imghsv= cvCreateImage(cvGetSize(img1),8,3);
//          imggray= cvCreateImage(cvGetSize(img1),8,3);
//        imgbin= cvCreateImage(cvGetSize(img1),8,1);
//       
        
        cvCvtColor(img1,imghsv,CV_BGR2HSV);
//        cvCvtColor(img1,imggray,CV_BGR2GRAY);
        //cvShowImage("without countour",imgbin);
       
        cvInRangeS(imghsv,min,max,imgbin);
        cvShowImage("bi",imgbin);
        areaMax = 1000;
//        char q=1;
//        if(q==1)
//        {
//        cvWaitKey(1000);
//        q++;
//        }

//        
        CvSeq contour1= new CvSeq();
if(imgbin==null || contour1==null||storage==null )continue;
        
        cvFindContours(imgbin,storage,contour1,Loader.sizeof(CvContour.class),CV_RETR_LIST,CV_LINK_RUNS,cvPoint(0,0));
        contour2= contour1;
        while(contour1!=null && !contour1.isNull())
        {
           areaC= cvContourArea(contour1,CV_WHOLE_SEQ,1) ;
           if(areaC>areaMax)
               areaMax= areaC;
           contour1=contour1.h_next();
            System.out.println("ghjkl");
            
            
        }
            System.out.println("pike");
         while(contour2!=null && !contour2.isNull())
         {
             
            areaC= cvContourArea(contour2,CV_WHOLE_SEQ,1) ;
           if(areaC<areaMax)
           {
              cvDrawContours(imgbin,contour2,CV_RGB(0,0,0),CV_RGB(0,0,0),0,CV_FILLED,8,cvPoint(0,0)); 
           }
               System.out.println("222222");
           contour2=contour2.h_next();
         }
//         CanvasFrame canvas= new CanvasFrame("Demo");
//        canvas.showImage(img1);
//        canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
//        
//         CanvasFrame canvas1= new CanvasFrame("Demo");
//        canvas.showImage(imghsv); 
//        canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
//        
//         CanvasFrame canvas2= new CanvasFrame("Demo");
//        canvas.showImage(imgbin);
//        canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
//        
//   
cvShowImage("real",img1);
cvShowImage("hsv",imghsv);
cvShowImage("binary",imgbin);


      
         System.out.println(" aur bahr");
        
   // cvWaitKey(15);
            System.out.println("aur aur bahar");
              char ch = (char)cvWaitKey(30);
       if(32  == ch)
       {break;
//         cvReleaseImage(img1);
//        cvReleaseImage(imgbin);
//        System.exit(0);
       }
       continue;
        
    
       
        
    }
         cvReleaseCapture(capture);
         cvReleaseImage(img1);
        cvReleaseImage(imgbin);
    }
}
    
   
        
        
        
    
    
    

