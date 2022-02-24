package com.example.task04;

public class Point {
    final String name;
    final int x;
    final int y;

    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    double distance(Point p) {
        return Math.round(Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2)));
    }
}
