package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    double distance(Point point) {
        return Math.sqrt(Math.pow(this.x-point.x, 2) + Math.pow(this.y - point.y, 2));
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    void print() {
        String toString = String.format("(%d, %d)", x, y);
        System.out.println(toString);
    }
}
