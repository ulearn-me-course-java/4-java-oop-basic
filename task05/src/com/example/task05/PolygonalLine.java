package com.example.task05;

import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points;
    private double len = 0;

    public PolygonalLine() {}

    public void setPoints(Point[] points) {
        this.points = points;
        length();
    }

    public void addPoint(Point point) {
        if (this.points == null) {
            this.points = new Point[]{point};
            this.len++;
        }
        else{
            Point[] refreshPoints = new Point[points.length + 1];
            System.arraycopy(points, 0, refreshPoints, 0, points.length);
            refreshPoints[refreshPoints.length - 1] = point;
            setPoints(refreshPoints);
        }
    }

    public void addPoint(double x, double y) {
        Point point = new Point(x,y);
        addPoint(point);
    }

    public double getLength() {
        return len;
    }

    private void length(){
        this.len = 0;
        for (int i = 0; i < points.length - 1; i++) {
            this.len += points[i].getLength(points[i + 1]);
        }
    }
}
