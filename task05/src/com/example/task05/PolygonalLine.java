package com.example.task05;
import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points;
    private double length = 0;
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        // TODO: реализовать
        this.points = points;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // TODO: реализовать
        points = Arrays.copyOf(points, points.length + 1);
        points[points.length - 1] = point;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        Point point = new Point(x, y);

        points = Arrays.copyOf(points,points.length +1);
        points[points.length - 1] = point;
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать

        for(int i = 0; i < points.length; i++)
        {
            Point p = points[i];
            length += p.getLength(points[i]);
        }

        return length;
    }

}
