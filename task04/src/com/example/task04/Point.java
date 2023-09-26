package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x;

    public int getX() {
        return x;
    }

    private final int y;

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x: %d, y: %d", this.x, this.y);
    }
}