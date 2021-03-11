package com.example.task05;

import java.util.ArrayList;


public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points.clear();
        for (Point e : points)
            addPoint(e);
    }


    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }


    public void addPoint(double x, double y) {
       points.add(new Point(x,y));
    }


    public double getLength() {
        double count = 0;
        for (int i = 1; i < points.size(); i++)
            count += points.get(i - 1).getLength(points.get(i));
        return count;
    }

}
