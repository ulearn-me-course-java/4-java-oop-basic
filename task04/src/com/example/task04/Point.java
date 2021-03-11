package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public double distance(Point point){
        return Math.sqrt( (point.x - x)*(point.x - x) + (point.y - y)*(point.y - y) );
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
