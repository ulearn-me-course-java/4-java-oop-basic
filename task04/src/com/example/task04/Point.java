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


    void flip() {

    }

    double distance(Point point) {
        Point point1 = new Point(x, y);
        return Math.sqrt(Math.pow(point1.x - point.x, 2) + Math.pow(point1.y - point.y, 2));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);

    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
