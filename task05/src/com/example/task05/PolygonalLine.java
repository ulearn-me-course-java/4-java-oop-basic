package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        Point[] temp = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            temp[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = new ArrayList<>(Arrays.asList(temp));
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
        if (points.size() < 2) return 0;

        double sum = 0;

        for (int i = 1; i < points.size(); i++) {
            sum += points.get(i - 1).getLength(points.get(i));
        }

        return sum;
        //throw new AssertionError();
    }

}
