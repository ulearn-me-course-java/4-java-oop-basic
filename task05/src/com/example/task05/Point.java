package com.example.task05;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    private final double x;
    private final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        return x;
        // throw new AssertionError();
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        return y;
        // throw new AssertionError();
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        double result = sqrt(((point.getX() - x) * (point.getX() - x)) + ((point.getY() - y) * (point.getY() - y)));
        return result;
        // throw new AssertionError();
    }

}
