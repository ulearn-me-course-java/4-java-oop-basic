package com.example.task05;

import java.util.List;
import java.util.ArrayList;

public class PolygonalLine {

    private List<Point> points = new ArrayList<>();
    public void setPoints(Point[] points) {
        this.points = new ArrayList<>();
        for (Point p : points) {
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }


    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }


    public double getLength() {
        double sum = 0.0;
        for(int i = 0; i < points.size()-1; i++) {
            sum += getLengthBetweenPoints(points.get(i), points.get(i+1));
        }
        return sum;
    }

    private double getLengthBetweenPoints(Point point1,  Point point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }

}
