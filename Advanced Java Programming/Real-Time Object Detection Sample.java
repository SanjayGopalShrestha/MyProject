/*

Real-Time Object Detection Project Code

Output Link:
============
https://www.youtube.com/watch?v=f5SSddoZSW0

*/

import org.opencv.core.*;
import org.opencv.dnn.Dnn;
import org.opencv.dnn.Net;
import org.opencv.videoio.VideoCapture;
import org.opencv.imgproc.Imgproc;
import org.opencv.highgui.HighGui;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ObjectDetection {

    public static void main(String[] args) throws Exception {

        // Load OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Load YOLO model
        Net net = Dnn.readNetFromDarknet("yolov3.cfg", "yolov3.weights");

        // Load class names
        List<String> classes = Files.readAllLines(Paths.get("coco.names"));

        // Get output layer names
        List<String> layerNames = net.getLayerNames();
        List<String> outputLayers = new ArrayList<>();
        for (int i : net.getUnconnectedOutLayers().toArray()) {
            outputLayers.add(layerNames.get(i - 1));
        }

        // Open webcam
        VideoCapture cap = new VideoCapture(0);
        Mat frame = new Mat();

        while (cap.read(frame)) {

            int width = frame.width();
            int height = frame.height();

            // Create blob
            Mat blob = Dnn.blobFromImage(frame, 1 / 255.0, new Size(416, 416),
                    new Scalar(0), true, false);

            net.setInput(blob);

            List<Mat> outputs = new ArrayList<>();
            net.forward(outputs, outputLayers);

            List<Rect> boxes = new ArrayList<>();
            List<Float> confidences = new ArrayList<>();
            List<Integer> classIds = new ArrayList<>();

            // Process detections
            for (Mat output : outputs) {
                for (int i = 0; i < output.rows(); i++) {

                    float[] data = new float[(int) output.cols()];
                    output.get(i, 0, data);

                    float confidence = 0;
                    int classId = -1;

                    for (int j = 5; j < data.length; j++) {
                        if (data[j] > confidence) {
                            confidence = data[j];
                            classId = j - 5;
                        }
                    }

                    if (confidence > 0.5) {
                        int centerX = (int) (data[0] * width);
                        int centerY = (int) (data[1] * height);
                        int w = (int) (data[2] * width);
                        int h = (int) (data[3] * height);

                        int x = centerX - w / 2;
                        int y = centerY - h / 2;

                        boxes.add(new Rect(x, y, w, h));
                        confidences.add(confidence);
                        classIds.add(classId);
                    }
                }
            }

            // Draw detections
            for (int i = 0; i < boxes.size(); i++) {
                Rect box = boxes.get(i);

                Imgproc.rectangle(frame, box, new Scalar(0, 255, 0), 2);

                String label = classes.get(classIds.get(i)) + 
                               String.format(" %.2f", confidences.get(i));

                Imgproc.putText(frame, label,
                        new Point(box.x, box.y - 5),
                        Imgproc.FONT_HERSHEY_SIMPLEX,
                        0.5, new Scalar(0, 255, 0));
            }

            HighGui.imshow("Real-Time Object Detection", frame);

            if (HighGui.waitKey(1) == 27) break; // ESC to exit
        }

        cap.release();
        HighGui.destroyAllWindows();
    }
}
