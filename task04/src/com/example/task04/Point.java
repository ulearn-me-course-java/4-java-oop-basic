package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public Point(int coordinateX, int coordinateY) {
        x = coordinateX;
        y = coordinateY;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
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
