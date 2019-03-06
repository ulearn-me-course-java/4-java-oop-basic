package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int temp = x;

        x = -y;
        y = -temp;
    }

    double distance(Point point) {
        return Math.sqrt(((x - point.x) * (x - point.x)) + ((y - point.y) * (y - point.y)));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public void print() {
        System.out.println(toString());
    }
}
