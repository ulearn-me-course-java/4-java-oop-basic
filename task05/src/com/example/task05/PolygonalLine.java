package com.example.task05;

import java.util.ArrayList;
import java.util.List;


/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points = new ArrayList<>();
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        // this.points = new ArrayList<>(Arrays.asList(points));
        this.points = new ArrayList<>();
        for(Point p : points) {
            this.points.add(new Point(p.getX(), p.getY()));
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
        Point point = points.get(0);
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += point.getLength(points.get(i));
            point = points.get(i);
        }
        return length;
    }

}
