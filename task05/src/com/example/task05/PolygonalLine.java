package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private ArrayList<Point> line;

    public PolygonalLine() {
        line = new ArrayList<>();
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
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
        line.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        line.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double lenght = 0;
        for (int i = 1; i < line.size(); i++) {
            Point p1 = line.get(i-1);
            Point p2 = line.get(i);
            lenght += p1.getLength(p2);
        }
        return lenght;
    }
}