package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point point){
        double a = Math.pow(x - point.x, 2);
        double b = Math.pow(y - point.y, 2);
        return Math.sqrt(a+b);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
