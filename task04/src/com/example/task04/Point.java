package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public void print() {
        System.out.println(toString());
    }
}