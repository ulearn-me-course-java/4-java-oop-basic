package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private final ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points.clear();

        for (Point p: points) {
            this.points.add(p.clone());
        }
    }

    public void addPoint(Point point) {
        this.points.add(point.clone());
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {

        double res = 0;

        for(int i = 0; i < this.points.size() - 1; i++){
            res += this.points.get(i).getLength(this.points.get(i+1));
        }

        return res;
    }

}
