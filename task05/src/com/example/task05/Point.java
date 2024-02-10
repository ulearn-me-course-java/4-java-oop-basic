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
        double distanceX = Math.pow(this.x - point.x, 2);
        double distanceY = Math.pow(this.y - point.y, 2);
        return Math.sqrt(distanceX + distanceY);
    }
    public Point clone() {
        return new Point(x, y);
    }
}
