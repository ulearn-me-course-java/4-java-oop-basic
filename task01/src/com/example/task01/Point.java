package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point point) {
        double a = Math.pow(x - point.x, 2);
        double b = Math.pow(y - point.y, 2);
        return Math.sqrt(a + b);
    }

    public String toString() {
        String output = Integer.toString(x) + ", " + Integer.toString(y);
        return output;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}