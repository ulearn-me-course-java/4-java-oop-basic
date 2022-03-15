package com.example.task05;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PolygonalLine {

    public ArrayList<Point> line = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point p : points) {
            line.add(new Point(p.getX(), p.getY()));
        }
    }

    public void addPoint(Point point) {
        line.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        line.add(new Point(x,y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < line.size() - 1; i++){
            length += line.get(i).getLength(line.get(i + 1));
        }
        return length;
    }
}
