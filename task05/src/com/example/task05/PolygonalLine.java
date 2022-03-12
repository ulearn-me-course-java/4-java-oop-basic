package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    /**
     * @param points массив точек ломанной линии
     */
    private List<Point> points;
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
        points.add(point);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double accumulator = 0;
        Stream<Point> enumerator = points.stream();
        if (points.size() >= 2){
            for(int i = 1; i < points.size(); i++)
                accumulator += points.get(i - 1).getLength(points.get(i));
            return accumulator;
        }
        else
            return 0;
    }

}
