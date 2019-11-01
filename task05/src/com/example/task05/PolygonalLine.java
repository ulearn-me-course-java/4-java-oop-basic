package com.example.task05;

import java.util.ArrayList;
import java.util.List;
/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points = new ArrayList<Point>();

    PolygonalLine(Point[] points) {
        if (points == null) {
            throw new NullPointerException();
        }
        this.points = new ArrayList<Point>();
        setPoints(points);
    }

    PolygonalLine() {
        points = new ArrayList<>();
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        // TODO: реализовать
        if (points == null) {
            throw new NullPointerException();
        }
        for (Point pnt : points) {
            this.points.add(new Point(pnt.getX(), pnt.getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // TODO: реализовать
        if (point == null) {
            throw new NullPointerException();
        }
        this.points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        this.points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        double lngth = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            lngth += points.get(i).getLength(points.get(i + 1));
        }
        return lngth;
    }

}
