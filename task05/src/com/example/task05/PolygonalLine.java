package com.example.task05;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Ломаная линия
 */
public class PolygonalLine {
    public ArrayList<Point> points = new ArrayList<Point>();

    public void setPoints(Point[] points) {
        for (Point point : points) {
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }

    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public double getLength() {
        double distance = 0.0;

        for(int i = 0; i < points.size() - 1; i++){
            distance += points.get(i).getLength(points.get(i + 1));
        }

        return distance;
    }

}
