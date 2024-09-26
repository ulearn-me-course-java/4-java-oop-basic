package com.example.task05;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    public ArrayList<Point> line = new ArrayList<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (Point p: points) {
            line.add(new Point(p.getX(), p.getY()));
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
        double length = 0;
        for (int i = 0; i < line.size() - 1; i++){
            length += line.get(i).getLength(line.get(i + 1));
        }
        return length;
    }

}
