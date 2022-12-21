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

    void flip() {
        int temp = this.x;
        this.x = -this.y;
        this.y = -temp;
    }

    double distance(Point point) {
        double dis = Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
        return dis;
    }

    public String toString() {
        return String.format("(%d,%d)", this.x, this.y);
    }

    void print() {
        System.out.println(toString());
    }
}
