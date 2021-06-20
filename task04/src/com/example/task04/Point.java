package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double distance(Point point) {
        int distance_x = Math.abs(point.x - this.x);
        int distance_y = Math.abs(point.y - this.y);
        return Math.sqrt(Math.pow(distance_x, 2) + Math.pow(distance_y, 2));
    }
    public String toString() {
        return (String.format("(%d, %d)", x, y));
    }
}