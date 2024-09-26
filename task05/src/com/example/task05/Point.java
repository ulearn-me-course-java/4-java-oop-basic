package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    protected final double x;
    protected final double y;

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

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        Point point1 = new Point(x, y);
        return Math.sqrt(Math.pow(point1.x - point.x, 2) + Math.pow(point1.y - point.y, 2));
    }

    public String toString() {
        return String.format("(%d.%d, %d.%d)", x, y);
    }

}
