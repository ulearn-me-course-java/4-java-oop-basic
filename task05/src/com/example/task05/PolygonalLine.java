package com.example.task05;

import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points;
    private double length;

    public PolygonalLine() {
        points = new Point[0];
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        length = 0;
        for (int counter = 0; counter < points.length; counter++) {
            this.points[counter] = points[counter];
            if (counter < points.length - 1) {
                length += points[counter].getLength(points[counter + 1]);
            }
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] newPoints = Arrays.copyOf(points, points.length + 1);
        newPoints[points.length] = point;
        setPoints(newPoints);
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
        return length;
    }

}
