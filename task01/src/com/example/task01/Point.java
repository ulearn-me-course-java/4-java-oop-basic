package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int newY = -x;
        x = -y;
        y = newY;
    }

    double distance(Point point) {
        return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
