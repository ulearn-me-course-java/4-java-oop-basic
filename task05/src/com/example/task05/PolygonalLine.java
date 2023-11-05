package com.example.task05;

import java.util.Arrays;

public class PolygonalLine {
    Point[] points;

    public PolygonalLine() {
        this.points = new Point[0];
    }
    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (byte i = 0; i < this.points.length; i++) {
            this.points[i] = new Point(points[i].x, points[i].y);
        }
    }
    public void addPoint(Point point) {
        this.points = Arrays.copyOf(this.points, this.points.length + 1);
        this.points[this.points.length - 1] = new Point(point.x, point.y);
    }
    public void addPoint(double x, double y) {
        this.points = Arrays.copyOf(this.points, this.points.length + 1);
        this.points[this.points.length - 1] = new Point(x, y);
    }
    public double getLength() {
        double length = 0;
        for (byte i = 0; i < points.length-1; i++){
            length += points[i].getLength(points[i+1]);
        }
        return length;
    }
}
