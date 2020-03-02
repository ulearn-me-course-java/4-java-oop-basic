package com.example.task04;

import java.text.MessageFormat;

public class Point {
    final double x;
    final double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return MessageFormat.format("({0}, {1})", x, y);
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }
}
