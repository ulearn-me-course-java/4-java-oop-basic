package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonalLine {
    private final List<Point> points;

    public PolygonalLine(Point[] points) {

        this.points = Arrays.asList(points);
    }

    public PolygonalLine() {
        points = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for (Point point : points) {
            addPoint(point);
    }


    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        if (points.size() > 1) {
            for (int i = 1; i < points.size(); i++) {
                length += points.get(i - 1).getLength(points.get(i));
            }
        }
        return length;
    }

}
