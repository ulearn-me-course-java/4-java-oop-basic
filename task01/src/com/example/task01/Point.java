package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point p) {
        return Math.round(Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2)));
    }
}

