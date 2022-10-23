package com.example.task04;

public class Point {
    final double x;
    final double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }


    double distance(Point point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }

    public String toString() {
        String x = Double.toString(this.x);
        String y = Double.toString(this.y);
        return x + "," + y;
    }
}
