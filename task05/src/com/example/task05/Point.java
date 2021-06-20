package com.example.task05;

public class Point {
    final double x;
    final double y;

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
        return Math.sqrt(Math.pow(Math.abs(point.x - this.x), 2) + Math.pow(Math.abs(point.y - this.y), 2));
    }
    public String toString() {
        return (String.format("(%f, %f)", x, y));
    }
}