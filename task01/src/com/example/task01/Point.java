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
        int temp = x;
        x = y*(-1);
        y = temp*(-1);
    }

    double distance(Point point) {
        int a = x - point.x;
        int b = y - point.y;
        return Math.sqrt(a*a + b*b);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
