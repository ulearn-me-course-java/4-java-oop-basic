package com.example.task05;

import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points = new Point[0];
    /**
     * Устанавливает точки ломаной линии
     *
     * @param arrayPoints массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] arrayPoints) {
        points = new Point[arrayPoints.length];
        for (int i = 0; i < arrayPoints.length; i++){
            points[i] = arrayPoints[i];
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] arr = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++) {
            arr[i] = points[i];
        }
        arr[points.length] = point;
        points = arr;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double sum = 0;
        for (int i = 1; i < points.length; i++) {
            sum += points[i-1].getLength(points[i]);
        }
        return sum;
    }
}
