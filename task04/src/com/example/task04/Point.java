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
        return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        System.out.println(this.toString());
    }
}
