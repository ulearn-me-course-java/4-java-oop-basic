package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points;

    public PolygonalLine(List<Point> points) {
        this.points = points;
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
        this.points = Arrays.asList(points);
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
        this.points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        if (this.points.size() == 0){
            return 0;
        }
        double length = 0;
        Point currentPoint = this.points.get(0);
        for (int i = 1; i < this.points.size(); i++){
            length += currentPoint.getLength(points.get(i));
            currentPoint = points.get(i);
        }
        return length;
    }

}
