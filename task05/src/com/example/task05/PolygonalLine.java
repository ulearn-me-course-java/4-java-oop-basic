package com.example.task05;

/**
 * Ломаная линия
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    private final List<Point> points;

    public PolygonalLine(Point[] points) {

        this.points = Arrays.asList(points);
    }

    public PolygonalLine() {
        points = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        // TODO: реализовать
        for (Point point : points) {
            addPoint(point);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // TODO: реализовать
        points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        double length = 0;
        if (points.size() > 1) {
            for (int i = 1; i < points.size(); i++) {
                length += points.get(i - 1).getLength(points.get(i));
            }
        }
        return length;
    }

}
