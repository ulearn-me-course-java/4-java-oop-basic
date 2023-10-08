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
        double deltaX = point.x - this.x;
        double deltaY = point.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
