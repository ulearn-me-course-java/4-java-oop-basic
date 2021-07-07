package com.example.task04;

public class Point {
    final double x;
    final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%a, %a)", x, y);
    }
}
