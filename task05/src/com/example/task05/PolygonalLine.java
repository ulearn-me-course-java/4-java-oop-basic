package com.example.task05;

import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points;

    public PolygonalLine(){
        points = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        this.points = Arrays.asList(points);
    }

    public void addPoint(Point point) {
        points.add(point);
    }
    public void addPoint(double x, double y) {
        points.add(new Point(x,y));
    }

    public double getLength() {
        double sum = 0;
        for (int i = 0; i<points.stream().count() - 1; i++ ){
            sum += points.get(i).getLength(points.get(i+1));
        }
        return sum;
    }

}
