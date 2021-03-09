package com.example.task01;

import static java.lang.Math.*;

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

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point) {
        return sqrt(pow(point.x - x, 2) + pow(point.y - y, 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
