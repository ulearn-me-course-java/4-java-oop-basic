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
        x = x + y;
        y = -(x - y);
        x = -(x + y);
    }

    public double distance(Point p) {
        int AbsX = Math.abs(p.x - this.x);
        int AbsY = Math.abs(p.y - this.y);
        return Math.sqrt(AbsX * AbsX + AbsY * AbsY);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
