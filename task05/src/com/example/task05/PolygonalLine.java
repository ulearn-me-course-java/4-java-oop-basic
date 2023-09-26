package com.example.task05;

import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points = new Point[0];

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        Point[] result = Arrays.copyOf(this.points,
                this.points.length + points.length);
        for (int i = this.points.length; i < result.length; i++) {
            result[i] = new Point(points[i - this.points.length].getX(), points[i - this.points.length].getY());
        }
        this.points = result;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] result = Arrays.copyOf(this.points,
                points.length + 1);
        result[result.length - 1] = new Point(point.getX(), point.getY());
        points = result;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point[] result = Arrays.copyOf(this.points,
                points.length + 1);
        result[result.length - 1] = new Point(x, y);
        points = result;
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double res = 0;
        for (int i = 0; i < points.length - 1; i++) {
            res += points[i].getLength(points[i + 1]);
        }
        return res;
    }

}
