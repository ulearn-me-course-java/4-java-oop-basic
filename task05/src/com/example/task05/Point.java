package com.example.task05;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLength(Point point) {
        double a = Math.pow(x - point.x, 2);
        double b = Math.pow(y - point.y, 2);
        return Math.sqrt(a + b);
    }
}
