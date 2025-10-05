package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private ArrayList<Point> listPoint;

    public void setPoints(Point[] points) {
        for (Point point : points) {
            addPoint(point);
        }
    }

    public void addPoint(Point point) {
        listPoint.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        listPoint.add(new Point(x, y));
    }

    public double getLength() {
        double sumLength = 0;
        for(int i = 0; i < listPoint.toArray().length - 1; i++){
            sumLength += listPoint.get(i).getLength(listPoint.get(i + 1));
        }
        return sumLength;
    }

    public PolygonalLine(){
        listPoint = new ArrayList<>();
    }
    public PolygonalLine(Point[] points){
        listPoint = new ArrayList<>();
        setPoints(points);
    }
}
