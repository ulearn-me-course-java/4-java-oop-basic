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

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    
    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }
    
    double distance(Point point) {
        return Math.sqrt((point.y - y) * (point.y - y) + (point.x - x) * (point.x - x));
    }
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
