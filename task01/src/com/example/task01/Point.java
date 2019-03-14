package com.example.task01;

public class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int tempX = x;
        x = -y;
        y = -tempX;
    }

    double distance(Point point) {
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}