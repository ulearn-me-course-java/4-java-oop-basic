package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    private double x;
    private double y;

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double getLength(Point point) {
        return Math.sqrt(Math.pow(Math.abs(x - point.x), 2) + Math.pow(Math.abs(y - point.y), 2));
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
