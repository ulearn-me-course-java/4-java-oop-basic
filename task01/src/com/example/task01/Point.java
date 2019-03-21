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

    void flip() {
        int z = x;
        x = -y;
        y = -z;
    }

    double distance(Point point) {
        double res = Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));
        return res;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
