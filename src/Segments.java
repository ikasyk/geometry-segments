import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
import java.util.ArrayList;

import com.objects.*;
import com.controls.Task;

public class Segments {
  public static void main(String[] args) {
    Scanner nameScanner = new Scanner(System.in);
    String fileName;
    System.out.print("Enter your file name: ");
    //fileName = nameScanner.nextLine();
    fileName = "segments.in";
    
    Path filePath = Paths.get(fileName);
    try {
      Scanner scanner = new Scanner(filePath);
      
      int i = 0;
      ArrayList<Double> rn = new ArrayList<>();
      
      while (scanner.hasNextDouble()) {
        rn.add(scanner.nextDouble());
        if (rn.size() == 8) {
          i++;
          System.out.print(i + ") ");
          Point p1 = new Point(rn.get(0), rn.get(1));
          Point p2 = new Point(rn.get(2), rn.get(3));
          Point p3 = new Point(rn.get(4), rn.get(5));
          Point p4 = new Point(rn.get(6), rn.get(7));
          try {
            Segment seg1 = new Segment(p1, p2);
            Segment seg2 = new Segment(p3, p4);
            Task t = new Task(seg1, seg2);
            System.out.println(t.getResult());
          } catch (IOException e) {
            System.out.println("Error: Segment is not correct.");
          }
          rn.clear();
        }
      }
    } catch (IOException e) {
      System.out.println("Error: file cannot be open.");
    }
  }
}