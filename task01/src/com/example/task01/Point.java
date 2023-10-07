package com.example.task01;

import java.lang.Math;

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

    public void flip() {
        int oldX = this.x;
        int oldY = this.y;
        this.x = -oldY;
        this.y = -oldX;
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
