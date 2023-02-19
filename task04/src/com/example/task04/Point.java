package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    double distance(Point point) {
        double xDifference = Math.abs(this.x - point.x);
        double yDifference = Math.abs(this.y - point.y);

        return Math.sqrt((xDifference * xDifference) + (yDifference * yDifference));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
