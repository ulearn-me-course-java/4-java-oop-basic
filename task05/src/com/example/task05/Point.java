package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {
    final double x;
    final double y;

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
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
        double a = Math.pow(x - point.x, 2);
        double b = Math.pow(y - point.y, 2);
        return Math.sqrt(a + b);
    }
}
