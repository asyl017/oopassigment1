package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private final ArrayList<Point> points = new ArrayList<>();
    private final List<Double> distances = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
        this.calculateDistance();
    }

    private void calculateDistance() {
        if (points.size() < 2) return;
        distances.clear();
        for (int i = 0; i < points.size(); i++)
            for (int j = i + 1; i < points.size(); i++)
                distances.add(points.get(i).getDistanceTo(points.get(j)));
    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (double i : distances)
            perimeter += i;

        return perimeter;
    }

    public double getAverageSide() {
        double perimeter = 0;

        for (double i : distances)
            perimeter += i;
        return perimeter / distances.size();
    }

    public double getLongestSide() {
        double longest = 0;
        for (double i : distances)
            longest = Math.max(i, longest);
        return longest;
    }

}

