package com.example.task04;

public class Point {
    private final int x;
    private final int y;

    public Point(int x0, int y0) {
        x = x0;
        y = y0;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x,2)+Math.pow(y - point.y,2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
