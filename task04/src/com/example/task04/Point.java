package com.example.task04;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point point) {
        double ac = point.x - x;
        double bc = point.y - y;
        return Math.sqrt(Math.pow(ac, 2) + Math.pow(bc, 2));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
