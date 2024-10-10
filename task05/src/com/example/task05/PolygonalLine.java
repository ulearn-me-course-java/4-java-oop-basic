package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
         this.points = Arrays
                .stream(points)
                .map(point -> new Point(point.getX(), point.getY()))
                .collect(Collectors.toList());
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        this.points.add(point);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() throws UnsupportedOperationException {
        int totalPoints = points.size();
        if(totalPoints < 2)
            throw new UnsupportedOperationException(
                    "The line must have at least 2 points. Got: " + totalPoints);

        double totalLength = 0;
        for (int i = 0; i < totalPoints - 1; i++) {
            Point p1 = this.points.get(i);
            Point p2 = this.points.get(i + 1);

            totalLength += p1.getLength(p2);
        }

        return totalLength;
    }
}
