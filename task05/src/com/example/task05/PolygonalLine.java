package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points = new ArrayList<>();
        for (Point p : points) {
            addPoint(p);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double len = 0;
        Point prevPoint = points.get(0);
        for (Point p : points) {
            len += prevPoint.getLength(p);
            prevPoint = p;
        }
        return len;
    }

}
