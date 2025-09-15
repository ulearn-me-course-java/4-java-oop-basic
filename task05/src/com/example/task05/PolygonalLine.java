package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */


public class PolygonalLine {
    private final ArrayList<Point> polygonalLine = new ArrayList<Point>();
    /**
     * Устанавливает точки ломаной линии
     *
     * @param polygonalLine массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPolygonalLine(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            addPoint(points[i]);
        }

    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        polygonalLine.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        polygonalLine.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for(int i = 0; i < polygonalLine.size(); i++) {
            if (i + 1 < polygonalLine.size()) {
                length += polygonalLine.get(i).getLength(polygonalLine.get(i + 1));
            }
        }
        return length;
    }

}
