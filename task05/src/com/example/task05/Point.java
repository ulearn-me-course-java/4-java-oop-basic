package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
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
        double Xd = Math.abs(point.x - x);
        double Yd = Math.abs(point.y - y);

        return Math.sqrt(Math.pow(Xd, 2) + Math.pow(Yd, 2));
    }

}
