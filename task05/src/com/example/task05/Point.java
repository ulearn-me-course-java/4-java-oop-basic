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
        double dx = Math.pow((x - point.getX()), 2);
        double dy = Math.pow((y - point.getY()), 2);
        return Math.sqrt(dx + dy);
    }
}