package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point) {
        int dx = this.x - point.x;
        int dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        System.out.println(toString());
    }
}