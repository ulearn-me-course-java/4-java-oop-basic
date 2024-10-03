package com.example.task05;

public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        // TODO: реализовать
        return x;
    }

    public double getY() {
        // TODO: реализовать
        return y;
    }

    public double getLength(Point point) {
        // TODO: реализовать
        return Math.sqrt(Math.pow(x - point.getX(),2) + Math.pow(y - point.getY(),2));
    }
}
