package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void flip() {
        int temp = x * (-1);
        x = y * (-1);
        y = temp;
    }
    double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
