package com.example.task04;

public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        int AbsX = Math.abs(p.x - this.x);
        int AbsY = Math.abs(p.y - this.y);
        return Math.sqrt(AbsX * AbsX + AbsY * AbsY);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
