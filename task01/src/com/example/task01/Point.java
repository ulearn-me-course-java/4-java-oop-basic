package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int temporaryX = x;
        this.x = -y;
        this.y = -temporaryX;
    }

    double distance(Point point) {
        int finiteDifferenceX = Math.abs(point.x - x);
        int finiteDifferenceY = Math.abs(point.y - y);
        return Math.sqrt(finiteDifferenceX * finiteDifferenceX + finiteDifferenceY * finiteDifferenceY);
    }

    public String toString() {
        return x + " " + y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
