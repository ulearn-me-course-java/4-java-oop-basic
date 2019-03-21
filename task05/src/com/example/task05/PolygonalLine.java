package com.example.task05;

import java.util.Vector;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Vector<Point> points = new Vector<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points.clear();
        for (Point point: points) {
            this.addPoint(point);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        this.addPoint(point.getX(), point.getY());
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
        double sum = 0;
        for (int i = 1; i < this.points.size(); i++) {
            sum += this.points.get(i).getLength(this.points.get(i-1));
        }
        return sum;
    }

}
