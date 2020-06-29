/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursorcantrol;
import com.googlecode.javacpp.Loader;
import com.googlecode.javacv.cpp.opencv_core;
import com.googlecode.javacv.cpp.opencv_core.CvArr;
import com.googlecode.javacv.cpp.opencv_core.CvMemStorage;
import com.googlecode.javacv.cpp.opencv_core.CvScalar;
import com.googlecode.javacv.cpp.opencv_core.CvSeq;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_core.cvCreateImage;
import static com.googlecode.javacv.cpp.opencv_core.cvOr;
import static com.googlecode.javacv.cpp.opencv_core.cvReleaseImage;
import static com.googlecode.javacv.cpp.opencv_core.cvReleaseMemStorage;
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
import com.googlecode.javacv.cpp.opencv_imgproc.CvMoments;
import java.awt.AWTException;


/**
 *
 * @author bikrant bikram
 */
public class CursorCantrol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
       
        
        CvArr mask;
        CvSeq contour1= new CvSeq();
        CvSeq contour2= null;
        
        
        IplImage img1,imghsv,imgC,imgbinB,imgbinG;
        CvCapture capture= cvCreateCameraCapture(CV_CAP_ANY);
        cvSetCaptureProperty(capture,CV_CAP_PROP_FRAME_WIDTH,320);
        cvSetCaptureProperty(capture,CV_CAP_PROP_FRAME_HEIGHT,240);
        
        CvScalar bmin=cvScalar(95,150,75,0);//for red 145,255,255,190,255,255
        CvScalar bmax=cvScalar(145,255,255,0);
        CvScalar gmin=cvScalar(0,70,50,0);//for red 40,50,60,80,255,255
        CvScalar gmax=cvScalar(10,255,255,0);
        
       
       
      
       CvMemStorage storage= opencv_core.CvMemStorage.create();
        double areaMax,areaC=0,m01,m10,m_area;
        imghsv= cvCreateImage(cvSize(320,240),8,3);
        
        imgbinB= cvCreateImage(cvSize(320,240),8,1);
        imgbinG= cvCreateImage(cvSize(320,240),8,1);
        imgC= cvCreateImage(cvSize(320,240),8,1);
        CvMoments moment = new CvMoments(Loader.sizeof(CvMoments.class));
        int X=0;
        int Y=0;
        
        
    
        
        
        while(1!=0)
        {
            //System.out.println("dubara");
            img1= cvQueryFrame(capture)  ;
          

            if(img1==null)break;
            
            imgbinB= Filter.filter(img1, imghsv, imgbinB, bmin, bmax, contour1, contour2, storage, moment, 1, 0);
            imgbinG= Filter.filter(img1, imghsv, imgbinG, gmin, gmax, contour1, contour2, storage, moment, 0, 1);
            
            
            cvOr(imgbinB,imgbinG,imgC,mask=null);
            
            cvShowImage("original",img1);
            cvShowImage("mix",imgC);
            
     
              char ch = (char)cvWaitKey(30);
       if(32  == ch)
       {break;
    
       } 
        
    }
        cvReleaseMemStorage(storage);
        
         cvReleaseCapture(capture);
         cvReleaseImage(img1);
       
        cvReleaseImage(imgbinG);
        cvReleaseImage(imgbinB);
    }
}
    
   
        
        
        
    
