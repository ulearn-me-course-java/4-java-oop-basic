package com.example.task05;

import java.util.LinkedList;
import java.util.List;

public class PolygonalLine {

    private List<Point> points = new LinkedList<>();

    public void setPoints(Point[] points) {
        for (int i = 0; i < points.length; i++){
            addPoint(points[i]);
        }
    }

    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x,y));
    }

    public double getLength() {
        double lenght = 0;
        for (int i = 0; i < points.size() - 1; i++){
            lenght += points.get(i).getLength(points.get(i + 1));
        }
        return lenght;
    }

}
