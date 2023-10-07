package com.example.task04;

import java.lang.Math;

/**
 * Класс точки на плоскости
 */
public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point flip() {
        return new Point(-this.y, -this.x);
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public String toString() {
        return String.format("(%s, %s)", this.x, this.y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}