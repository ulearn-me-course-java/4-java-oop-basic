package com.example.task04;

public class Point {
    private final int x;
    private final int y;

    public int getX() { return x; }
    public int getY() { return y; }

    public double distance(Point to) {
        int dx = this.x - to.x;
        int dy = this.y - to.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
