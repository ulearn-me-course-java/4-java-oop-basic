package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point point){
        return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
