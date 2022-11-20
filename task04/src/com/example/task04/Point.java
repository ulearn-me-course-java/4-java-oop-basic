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
    double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    public String toString() {
        String p1 = String.valueOf(x);
        String p2 = String.valueOf(y);
        return "(" + p1 + "," + p2 + ")";
    }
}
