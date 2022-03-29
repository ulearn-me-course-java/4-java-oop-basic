package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public double getLength(Point point) {
        double a = Math.pow((double)(this.getX() - point.getX()), (double)2);
        double b = Math.pow((double)(this.getY() - point.getY()), (double)2);
        return Math.sqrt(a + b);
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }
}
