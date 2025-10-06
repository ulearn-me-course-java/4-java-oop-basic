package com.example.task05;


import java.util.ArrayList;

public class PolygonalLine {
    private ArrayList<Point> linePoints = new ArrayList<Point>();

    public void setPoints(Point[] points) {
        for(Point p: points){
            addPoint(p);
        }
    }

    public void addPoint(Point point) {
        linePoints.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        linePoints.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for(int i = 0; i < linePoints.size() - 1; i++){
            Point p1 = linePoints.get(i);
            Point p2 = linePoints.get(i + 1);
            length += p1.getLength(p2);
        }
        return length;
    }

}
