package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x, y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int t = x;
        x = -y;
        y = -t;
    }

    double distance(Point point) {
        return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
    }

    void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
