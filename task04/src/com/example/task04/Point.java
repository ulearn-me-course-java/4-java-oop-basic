package com.example.task04;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2)); //sqrt((p.x - this.x)**2 + (p.y - this.y)**2)
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }


}