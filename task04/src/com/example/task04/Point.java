package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    
    double distance(Point point) {
        return Math.sqrt((point.y - y) * (point.y - y) + (point.x - x) * (point.x - x));
    }
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}