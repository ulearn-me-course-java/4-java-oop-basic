package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final double x;
    final double y;

    Point(double х, double у) {
        this.x = х;
        this.y = у;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

}
