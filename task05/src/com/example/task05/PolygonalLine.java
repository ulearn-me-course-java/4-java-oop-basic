package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

   private List<Point> points;


    public PolygonalLine(Point[] points) {

        this.points = new ArrayList<>();
        for (Point point :points ) {
            this.points.add(point);
        }
    }
    public PolygonalLine() {
        this.points = new ArrayList<>();
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

        double x = point.getX();
        double y = point.getY();
        Point newPoint = new Point(x,y);
        this.points.add(newPoint);
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
            length += points.get(i).getLength(points.get(i-1));
        }
        return length;

    }

}
