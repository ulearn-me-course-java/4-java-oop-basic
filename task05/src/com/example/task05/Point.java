package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.y = y;
        this.x = x;
    }

    public double getX() {
        // TODO: реализовать
        return x;
    }

    public double getY() {
        // TODO: реализовать
        return y;
    }

    public double getLength(Point point) {
        // TODO: реализовать
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
    void print() {

        System.out.println(toString());
    }
}
