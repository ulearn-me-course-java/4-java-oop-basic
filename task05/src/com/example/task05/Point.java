package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {
    public final double x;
    public final double y;

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

    public double getLength(Point p) {
        double AbsX = Math.abs(p.x - this.x);
        double AbsY = Math.abs(p.y - this.y);
        return Math.sqrt(AbsX * AbsX + AbsY * AbsY);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}
