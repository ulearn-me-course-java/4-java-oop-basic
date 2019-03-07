package com.example.task05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonalLine {

    List<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point newPoint : points) {
            addPoint(newPoint);
        }
    }

    public void addPoint(Point point) {
        points.add(new Point(point.x, point.y));
    }
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;

        for (int i = 1; i < points.size(); i++) {
            length += points.get(i).getLength(points.get(i - 1));
        }

        return length;
    }

}
