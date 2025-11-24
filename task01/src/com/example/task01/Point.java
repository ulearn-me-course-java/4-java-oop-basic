package com.example.task01;

public class Point {
    int x;
    int y;
    Point(){}
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void flip() {
        int temp = x;
        x = (-1) * y;
        y = (-1) * temp;
    }
    double distance(Point point) {
        return Math.sqrt((y - point.y) * (y - point.y) + (x - point.x) * (x - point.x));
    }
    public String toString() {
        return "(" + Integer.toString(x) + ", " + Integer.toString(y) + ")";
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}