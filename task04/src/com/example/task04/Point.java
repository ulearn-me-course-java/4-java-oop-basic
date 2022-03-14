package com.example.task04;

public class Point {
    public final double X, Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public String toString() {
        return "(" + X + "," + Y + ")";
    }
}
