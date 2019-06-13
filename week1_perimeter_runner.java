import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        int count=0;
        for(Point p :  s.getPoints()){
            count++;
        }        
        return count;
    }

    public double getAverageLength(Shape s) {
        double average = 0;
        average = getPerimeter(s)/getNumPoints(s);
        return average;
    }

    public double getLargestSide(Shape s) {
        double largest = 0;
        double temp = 0; 
        Point currPnt;
        currPnt = s.getLastPoint();
        for(Point p :  s.getPoints()){
            temp = currPnt.distance(p);
            if(temp > largest){
                largest = temp; 
            }
            currPnt = p;
        }   
        return largest;
    }

    public double getLargestX(Shape s) {
        double largestx = 0;
        double temp; 
        for (Point p : s.getPoints()){
            temp = p.getX();
            if(temp>largestx){ 
                largestx = temp; 
            }
        }
        return largestx;
    }

    public double getLargestPerimeterMultipleFiles() {
        double largest = 0;
        double temp = 0; 
        DirectoryResource r = new DirectoryResource();
        for(File f : r.selectedFiles()){
            FileResource fr = new FileResource(f);
            Shape t = new Shape(fr); 
            temp = getPerimeter(t);
            if(temp > largest){
                largest = temp; 
            }     
            
        }
        return largest;
    }

    public String getFileWithLargestPerimeter() {
        DirectoryResource dir = new DirectoryResource();
        double tmp = 0;
        double largestp = 0;
        File temp = null;
                 for(File f : dir.selectedFiles()){
                     FileResource fr = new FileResource(f);
                     Shape t = new Shape(fr);
                     tmp = getPerimeter(t);
                     if(tmp > largestp){
                     largestp = tmp;
                     temp = f; 
                 }
        }
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource("example4.txt");
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        System.out.println("The number of points on this shape: " + getNumPoints(s));
        System.out.println("The average length on this shape: " + getAverageLength(s));
        System.out.println("The longest side on this shape: " + getLargestSide(s));
        System.out.println("The biggest X point on this shape: " + getLargestX(s));   
    }
    
    public void testPerimeterMultipleFiles() {
        System.out.println("The largest perimeter in this file is: " + getLargestPerimeterMultipleFiles()); 
    }

    public void testFileWithLargestPerimeter() {
        System.out.println("The file with the largest perimeter in this file is: " + getFileWithLargestPerimeter()); 
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        System.out.println(pr.getFileWithLargestPerimeter());
        /*FileResource fr = new FileResource("datatest4.txt");
        Shape t = new Shape(fr); 
        System.out.println(pr.getLargestSide(t));*/
    }
}
