package com.example.task04;

import static java.lang.Math.*;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    double distance(Point point) {
        return sqrt(pow(point.x - x, 2) + pow(point.y - y, 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
