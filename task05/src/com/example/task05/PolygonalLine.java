package com.example.task05;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points = new Point[1];
    private int countOfPoints = 0;
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (Point point:points) {
            addPoint(point);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (countOfPoints == points.length) {
            Point[] pointsNew = Arrays.copyOf(points, points.length + 1);
            points = pointsNew;
        }
        points[countOfPoints] = new Point(point.getX(), point.getY());
        countOfPoints++;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x,y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 1; i < countOfPoints; i++) {
            length += Math.sqrt(Math.pow(points[i].getX() - points[i - 1].getX(), 2)
                    + Math.pow(points[i].getY() - points[i - 1].getY(), 2));
        }
        return length;
    }
}
