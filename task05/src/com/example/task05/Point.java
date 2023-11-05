package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    private final double x;
    private final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getLength(Point point) {
        double new_x = Math.abs(this.x - point.x);
        double new_y = Math.abs(this.y - point.y);

        return  Math.sqrt(new_x * new_x + new_y * new_y);
    }
    @Override
    public Point clone() {
        return new Point(x, y);
    }

}
