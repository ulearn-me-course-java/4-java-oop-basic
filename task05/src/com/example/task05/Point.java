package com.example.task05;

public class Point {

    private final int x;
    private final int y;

    public Point(double x, double y) {
        this.x = (int) Math.round(x);
        this.y = (int) Math.round(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLength(Point point) {
        double deltaX = this.x - point.x;
        double deltaY = this.y - point.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}