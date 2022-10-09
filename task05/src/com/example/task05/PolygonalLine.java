package com.example.task05;

import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    List<Point> points;


    PolygonalLine(Point[] points) {

    }
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {

        for (int i = 0; i < points.length; i++) {
            Point point = new Point(points[i].getX(), points[i].getY());
            this.points.add(point);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        this.points.add(point);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x,y);
        this.points.add(point);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += Math.sqrt(Math.pow(points[i].getX() - points[i - 1].getX(), 2) + Math.pow(points[i].getY() - points[i - 1].getY(), 2));
        }
        return length;

    }

}
