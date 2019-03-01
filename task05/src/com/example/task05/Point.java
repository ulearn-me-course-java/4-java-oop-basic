package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point implements Cloneable{
    private double x;
    private double y;

    public Point(double X, double Y) {
        x = X;
        y = Y;
    }

    public double getX() { return this.x; }
    public double getY() { return this.y; }

    public double getLength(Point point) {
        double dx = (this.x - point.x) * (this.x - point.x);
        double dy = (this.y - point.y) * (this.y - point.y);

        return Math.sqrt(dx + dy);
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point)super.clone();
    }
}
