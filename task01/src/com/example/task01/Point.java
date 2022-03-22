package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int tmp = x;
        x = -y;
        y = -tmp;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(point.y - y, 2) + Math.pow(point.x - x, 2));
    }

    public String toString() {
        return '(' + x + ", " + y + ')';
    }


    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
