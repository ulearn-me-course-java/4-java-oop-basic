package com.example.task01;

import java.lang.Math;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point () {
        this.x = 0;
        this.y = 0;
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance (Point point) {
        return Math.hypot(this.x - point.x, this.y - point.y);
    }

    public void flip () {
        int old_x = this.x;
        this.x = -this.y;
        this.y = -old_x;
    }

    public String toString () {
        return "(" + this.x + ", " + this.y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
