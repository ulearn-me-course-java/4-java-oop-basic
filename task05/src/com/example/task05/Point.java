package com.example.task05;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getLength(Point point) {
        double X = point.x - this.x;
        double Y = point.y - this.y;
        return Math.sqrt(X * X + Y * Y);
    }
}
