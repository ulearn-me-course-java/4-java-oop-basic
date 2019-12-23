package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int buf = x;
        x = -1 * y;
        y = -1 * buf;
    }

    double distance (Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + this.x + ";" + this.y + ")";
    }
}