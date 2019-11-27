package com.example.task04;
/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    double distance(Point point) {
//        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
//    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

//    void print() {
//        String pointToString = String.format("(%d, %d)", x, y);
//        System.out.println(pointToString);
//    }
}