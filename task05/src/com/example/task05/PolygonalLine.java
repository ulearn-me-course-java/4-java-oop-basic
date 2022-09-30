package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PolygonalLine {

    private List<Point> points;

    public PolygonalLine(Point[] points) {
        for (Point value : points) {
            Point point = new Point(value.getX(), value.getY());
            this.points.add(point);
        }
    }

    public PolygonalLine() {
        this.points = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            Point newPoint = new Point(points[i].getX(), points[i].getY());
            this.points.add(newPoint);
        }
    }

    public void addPoint(Point point) {
        Point newPoint = new Point(point.getX(), point.getY());
        points.add(newPoint);
    }

    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        addPoint(point);
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).getLength(points.get(i + 1));
        }
        return length;
    }

}
