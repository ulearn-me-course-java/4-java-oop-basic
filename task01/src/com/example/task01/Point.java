package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int coordinateX, int coordinateY) {
        x = coordinateX;
        y = coordinateY;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip() {
        int newX = y;
        y = -x;
        x = -newX;
    }

    double distance(Point point) {
        double distanceX = Math.abs(point.x - x);
        double distanceY = Math.abs(point.y - y);
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
