package com.example.task04;

public class Point {

    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point point) {
        double dX = Math.pow(x - point.x, 2);
        double dY = Math.pow(y - point.y, 2);
        return Math.sqrt(dX + dY);

    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }


    void print() {
        String pointToString = toString();
        System.out.println(pointToString);
    }

}
