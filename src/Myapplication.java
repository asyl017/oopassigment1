import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Myapplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\asyl\\IdeaProjects\\assigment.1\\src\\source");
        Scanner in = new Scanner(file);
        Shape shape = new Shape();
        while (in.hasNextLine()) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongestSide());
        System.out.println(shape.getAverageSide());
    }
}
