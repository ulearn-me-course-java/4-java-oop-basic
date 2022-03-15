package com.example.task01;

import org.assertj.core.internal.bytebuddy.implementation.ToStringMethod;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int temp = x;
        x = -1*y;
        y = -1*temp;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow((point.x - x), 2) + Math.pow((point.y - y), 2));
    }

    public String toString() {
        String pointToString = String.format("(%d, %d)", x, y);
        return  pointToString;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}