package com.example.task05;

public class Point {
    final double x;
    final double y;

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
        double distanceX = Math.abs(this.x - point.x);
        double distanceY = Math.abs(this.y - point.y);
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }

    public Point clone() {
        return new Point(x, y);
    }
}
