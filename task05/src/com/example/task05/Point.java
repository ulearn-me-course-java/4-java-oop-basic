package com.example.task05;

import java.util.concurrent.atomic.AtomicLongArray;

/**
 * Точка в двумерном пространстве
 */
public class Point implements Cloneable {
    /**
     * @param x поле которое хранит координату x точки на плоскости
     * @param x поле которое хранит координату y точки на плоскости
     */
    private double x, y;
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

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        return x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
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
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}