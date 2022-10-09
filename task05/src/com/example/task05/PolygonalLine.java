package com.example.task05;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private List<Point> points = new ArrayList<Point>();
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (Point point: points) {
            this.points.add(point.clone());
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        points.add(point.clone());
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
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).getLength(points.get(i+1));
        }

        return length;
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < points.size(); i++) {
            out += String.format("p%d %s\n", i, points.get(i).toString());
        }

        return out;
    }
}
