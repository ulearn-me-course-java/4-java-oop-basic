package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public void flip() {
        int newX = -y;
        int newY = -x;
        x = newX;
        y = newY;
    }

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

    public Point() { }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
