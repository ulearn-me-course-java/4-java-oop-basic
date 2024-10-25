package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    double distance(Point point){
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    public String toString(){
        return String.format("(%f, %f)", x, y);
    }
}
