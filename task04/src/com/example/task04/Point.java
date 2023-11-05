package com.example.task04;

public class Point {
    public final int X;
    public final int Y;

    public Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    double distance(Point point) throws Exception {
        if (point == null)
            throw new Exception("Point null reference");

        return Math.sqrt(Math.pow(X - point.X, 2) + Math.pow(Y - point.Y, 2));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", X, Y);
        System.out.println(pointToString);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", X, Y);
    }
}

