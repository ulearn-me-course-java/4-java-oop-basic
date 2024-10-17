package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip() {
        int rememberX = x;
        x = y*(-1);
        y = rememberX*(-1);
    }
    double distance(Point p1) {
        double dist = Math.sqrt(Math.pow(x - p1.x, 2) + Math.pow(y - p1.y, 2));
        return dist;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
