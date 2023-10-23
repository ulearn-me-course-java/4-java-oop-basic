package com.example.task04;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) +
                         Math.pow(this.y - point.y, 2));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}