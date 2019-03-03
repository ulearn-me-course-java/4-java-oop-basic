package com.example.task04;

public class Point {
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

    private final int x;
    private final int y;

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

}
