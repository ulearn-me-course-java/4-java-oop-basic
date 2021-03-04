package com.example.task01;

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
        x = -x;
        y = -y;
        int a = x;
        x = y;
        y = a;
    }

    double distance(Point point) {
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));
    }

    public String toString() {
        return String.format("(%s, %s)", x, y);
    }
}
