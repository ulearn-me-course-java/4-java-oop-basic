package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    private final double X;
    private final double Y;

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
        return  Math.sqrt(Math.pow(this.X-point.X,2)+Math.pow(this.Y-point.Y,2));
    }

}
