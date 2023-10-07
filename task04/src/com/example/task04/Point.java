package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        int distanceX = Math.abs(this.x - point.x);
        int distanceY = Math.abs(this.y - point.y);
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }

    public Point flip() { return new Point(-y, -x); }

    void print() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
