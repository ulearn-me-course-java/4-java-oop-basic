package com.example.task05;

import static java.lang.Math.sqrt;

public class Point {

    final double X;
    final double Y;

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public double getX() {
        return this.X;
    }

    public double getY() {
        return this.Y;
    }

    public double getLength(Point point) {
        double dist = 0;

        dist = sqrt(Math.pow(X - point.X, 2) + Math.pow(Y - point.Y, 2));

        return dist;
    }

}
