package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class    Point {
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
        double x_distanse = Math.max(x,point.x) - Math.min(x,point.x);
        double y_distanse = Math.max(y,point.y) - Math.min(y,point.y);
        return Math.sqrt(Math.pow(x_distanse,2) + Math.pow(y_distanse,2));
    }

}
