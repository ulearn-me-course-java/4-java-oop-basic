package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        int distanceX = Math.abs(this.x - point.x);
        int distanceY = Math.abs(this.y - point.y);
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }

    public void flip() {
        int cell = x;
        x = -y;
        y = -cell;
    }

    void print() {
        System.out.println(this.toString());
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
