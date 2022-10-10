package com.example.task04;

public class Point {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double distance(Point point) {
        double dis = Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
        return dis;
    }
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
