package com.example.task05;

public class Point {
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private final double x;

    public double getX() {
        return x;
    }

    private final double y;

    public double getY() {
        return y;
    }

    public double getLength(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

}
