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
        return Math.sqrt(Math.pow((this.x - point.x),2) + Math.pow((this.y - point.y),2));
    }

    public String toString () {
        return String.format("(%d,%d)",this.x,this.y);
    }
}
