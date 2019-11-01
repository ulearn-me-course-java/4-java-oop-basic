package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> pointList = new ArrayList<>();

    void setPoints(Point[] points) {
        if (points == null) {
            throw new IllegalArgumentException();
        }
        if (pointList.size() == 0) {
            for (Point point : points) pointList.add(new Point(point.getX(), point.getY()));
        }
    }

    PolygonalLine() {
        ;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (point == null) {
            throw new IllegalArgumentException();
        }
        pointList.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        pointList.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double len = 0;
        for (int i = 0; i < pointList.size() - 1; i++) {
            len += pointList.get(i).getLength(pointList.get(i + 1));
        }
        return len;
    }

}
