package com.example.task05;

public class Point {
    private final double X;
    private final double Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double getLength(Point point) {
        double a = Math.pow(X - point.X, 2);
        double b = Math.pow(Y - point.Y, 2);

        return Math.sqrt(a + b);
    }

}
