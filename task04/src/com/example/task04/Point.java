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

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    double distance(Point p1){
        return Math.sqrt(Math.pow((this.getX() - p1.getX()), 2) + Math.pow((this.getY() - p1.getY()), 2));
    }
}
