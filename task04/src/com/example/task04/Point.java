package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public Point flip() {
        return new Point(-y, -x);
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }
}