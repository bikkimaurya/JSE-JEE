package imageprocessing;
import static com.googlecode.javacv.JavaCV.boundingRect;
import static com.googlecode.javacv.cpp.opencv_core.CV_32FC1;
import com.googlecode.javacv.cpp.opencv_core.CvSeq;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_BGR2GRAY;
import java.util.ArrayList;
import org.omg.CORBA.Any;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import static org.opencv.highgui.HighGui.imshow;
import static org.opencv.imgproc.Imgproc.ADAPTIVE_THRESH_GAUSSIAN_C;
import static org.opencv.imgproc.Imgproc.CHAIN_APPROX_SIMPLE;
import static org.opencv.imgproc.Imgproc.RETR_EXTERNAL;
import static org.opencv.imgproc.Imgproc.THRESH_BINARY_INV;
import static org.opencv.imgproc.Imgproc.adaptiveThreshold;
import static org.opencv.imgproc.Imgproc.cvtColor;
import static org.opencv.imgproc.Imgproc.findContours;

/**
 *
 * @author bikrant bikram
 */
public class Character {
    
final int MIN_CONTOUR_AREA = 100;

final int RESIZED_IMAGE_WIDTH = 20;
final int RESIZED_IMAGE_HEIGHT = 30;

///////////////////////////////////////////////////////////////////////////////////////////////////
public static void main(String[] args) 
 {

    Mat imgTrainingNumbers=null;         // input image
    Mat imgGrayscale=null;               // 
    Mat imgBlurred=null;                 // declare various images
    Mat imgThresh=null;                  //
    Mat imgThreshCopy=null;              //

    ArrayList<MatOfPoint> ptContours= new ArrayList();        // declare contours vector
   Mat v4iHierarchy=null;                    // declare contours hierarchy

     Mat matClassificationInts= null;      // these are our training classifications, note we will have to perform some conversions before writing to file later

                                        // these are our training images, due to the data types that the KNN object KNearest requires, we have to declare a single Mat,
                                        // then append to it as though it's a vector, also we will have to perform some conversions before writing to file later
   Mat matTrainingImagesAsFlattenedFloats=null;

    // possible chars we are interested in are digits 0 through 9 and capital letters A through Z, put these in vector intValidChars
    ArrayList <String > intValidChars = new ArrayList<>()    ;
    intValidChars.add("0");
    intValidChars.add("1");
    intValidChars.add("2");
    intValidChars.add("3");
    intValidChars.add("4");
    intValidChars.add("5");
    intValidChars.add("6");
    intValidChars.add("7");
    intValidChars.add("8");
    intValidChars.add("9");
    intValidChars.add("A");
    intValidChars.add("B");
    intValidChars.add("C");
    intValidChars.add("D");
    intValidChars.add("E");
    intValidChars.add("F");
    intValidChars.add("G");
    intValidChars.add("H");
    intValidChars.add("I");
    intValidChars.add("J");
    intValidChars.add("K");
    intValidChars.add("L");
    intValidChars.add("M");
    intValidChars.add("N");
    intValidChars.add("O");
    intValidChars.add("P");
    intValidChars.add("Q");
    intValidChars.add("R");
    intValidChars.add("S");
    intValidChars.add("T");
    intValidChars.add("U");
    intValidChars.add("V");
    intValidChars.add("W");
    intValidChars.add("X");
    intValidChars.add("Y");
    intValidChars.add("Z");
    
    
   

    imgTrainingNumbers = null;//Load("training_chars2.png");          // read in training numbers image

    if (imgTrainingNumbers.empty()) {                               // if unable to open image
        System.out.println("\"error: image not read from file\\n\\n\";");          // show error message on command line
        System.exit(0);                                                  // and exit program
    }

  cvtColor(imgTrainingNumbers, imgGrayscale, CV_BGR2GRAY);        // convert to grayscale

//    GaussianBlur(imgGrayscale,              // input image
//        imgBlurred,                             // output image
//        setSize(5, 5),                         // smoothing window width and height in pixels
//        0);                                     // sigma value, determines how much the image will be blurred, zero makes function choose the sigma value

                                                // filter image from grayscale to black and white
   adaptiveThreshold(imgBlurred,           // input image
        imgThresh,                              // output image
        255,                                    // make pixels that pass the threshold full white
       ADAPTIVE_THRESH_GAUSSIAN_C,         // use gaussian rather than mean, seems to give better results
        THRESH_BINARY_INV,                  // invert so foreground will be white, background will be black
        11,                                     // size of a pixel neighborhood used to calculate threshold value
        2);                                     // constant subtracted from the mean or weighted mean

    imshow("imgThresh", imgThresh);         // show threshold image for reference

    imgThreshCopy = imgThresh.clone();          // make a copy of the thresh image, this in necessary b/c findContours modifies the image

    findContours(imgThreshCopy,             // input image, make sure to use a copy since the function will modify this image in the course of finding contours
        ptContours,                             // output contours
        v4iHierarchy,                           // output hierarchy
        RETR_EXTERNAL,                      // retrieve the outermost contours only
        CHAIN_APPROX_SIMPLE);               // compress horizontal, vertical, and diagonal segments and leave only their end points

    for (int i = 0; i < ptContours.size(); i++) {                           // for each contour
        if (contourArea(ptContours(i))> MIN_CONTOUR_AREA) {                // if contour is big enough to consider
           Rect boundingRect = cv::boundingRect(ptContours[i]);                // get the bounding rect

           rectangle(imgTrainingNumbers, boundingRect, cv::Scalar(0, 0, 255), 2);      // draw red rectangle around each contour as we ask user for input

            Mat matROI = imgThresh(boundingRect);           // get ROI image of bounding rect

            Mat matROIResized;
            resize(matROI, matROIResized, cv::Size(RESIZED_IMAGE_WIDTH, RESIZED_IMAGE_HEIGHT));     // resize image, this will be more consistent for recognition and storage

           imshow("matROI", matROI);                               // show ROI image for reference
            imshow("matROIResized", matROIResized);                 // show resized ROI image for reference
            imshow("imgTrainingNumbers", imgTrainingNumbers);       // show training numbers image, this will now have red rectangles drawn on it

            int intChar = cv::waitKey(0);           // get key press

            if (intChar == 27) {        // if esc key was pressed
                return(0);              // exit program
            }
            else if (std::find(intValidChars.begin(), intValidChars.end(), intChar) != intValidChars.end()) {     // else if the char is in the list of chars we are looking for . . .

                matClassificationInts.push_back(intChar);       // append classification char to integer list of chars

                cv::Mat matImageFloat;                          // now add the training image (some conversion is necessary first) . . .
                matROIResized.convertTo(matImageFloat, CV_32FC1);       // convert Mat to float

                cv::Mat matImageFlattenedFloat = matImageFloat.reshape(1, 1);       // flatten

                matTrainingImagesAsFlattenedFloats.push_back(matImageFlattenedFloat);       // add to Mat as though it was a vector, this is necessary due to the
                                                                                            // data types that KNearest.train accepts
            }   // end if
        }   // end if
    }   // end for

    std::cout << "training complete\n\n";

    // save classifications to file ///////////////////////////////////////////////////////

    cv::FileStorage fsClassifications("classifications.xml", cv::FileStorage::WRITE);           // open the classifications file

    if (fsClassifications.isOpened() == false) {                                                        // if the file was not opened successfully
        std::cout << "error, unable to open training classifications file, exiting program\n\n";        // show error message
        return(0);                                                                                      // and exit program
    }

    fsClassifications << "classifications" << matClassificationInts;        // write classifications into classifications section of classifications file
    fsClassifications.release();                                            // close the classifications file

                                                                            // save training images to file ///////////////////////////////////////////////////////

    cv::FileStorage fsTrainingImages("images.xml", cv::FileStorage::WRITE);         // open the training images file

    if (fsTrainingImages.isOpened() == false) {                                                 // if the file was not opened successfully
        std::cout << "error, unable to open training images file, exiting program\n\n";         // show error message
        return(0);                                                                              // and exit program
    }

    fsTrainingImages << "images" << matTrainingImagesAsFlattenedFloats;         // write training images into images section of images file
    fsTrainingImages.release();                                                 // close the training images file

    return(0);
}
}
