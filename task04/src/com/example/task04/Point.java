package com.example.task04;

public class Point {
    double x;
    double y;

    Point() {
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%f, %f)", x, y);
        System.out.println(pointToString);
    }

    void flip() {
        double tmp = -x;
        x = -y;
        y = tmp;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    public String toString() {
        return String.format("(%f:2, %f:2)", x, y);
    }
}
