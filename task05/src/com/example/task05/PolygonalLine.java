package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    private final ArrayList<Point> Line;

    public PolygonalLine()
    {
        Line = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for (Point p : points)
        {
            addPoint(p);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Line.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Line.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 1; i < this.Line.size(); i++)
        {
            Point p1 = Line.get(i - 1);
            Point p2 = Line.get(i);
            length += p1.getLength(p2);
        }
        return length;
    }

}
