package com.example.task04;

import static java.lang.Math.pow;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    Point(int i, int j){
        x = i;
        y = j;
    }

    double distance(Point p){
        return Math.sqrt(pow(p.x - x, 2) + pow(p.y - y, 2));
    }

    @Override
    public String toString() { return String.format("(%d, %d)", x, y); }
}
