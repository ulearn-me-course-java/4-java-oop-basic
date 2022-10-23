package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int p1, int p2) {
        x = p1;
        y = p2;
    }

    void flip() {
        int p1 = x;
        int p2 = y;
        x = (-1) * p2;
        y = (-1) * p1;
    }

    double distance(Point point) {
        int x1 = x, y1 = y;
        int x2 = point.x, y2 = point.y;
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
