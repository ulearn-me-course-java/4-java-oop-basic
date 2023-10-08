package com.example.task01;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point point) {
        int deltaX = x - point.x;
        int deltaY = y - point.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
