package com.example.task04;

public class Point {
    final int x;
    final int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point point) {
        return Math.sqrt((y - point.y) * (y - point.y) + (x - point.x) * (x - point.x));
    }
    public String toString() {
        return "(" + Integer.toString(x) + ", " + Integer.toString(y) + ")";
    }

}