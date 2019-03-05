package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ломаная линия
 */
public class PolygonalLine{

    private List<Point> pointList = new ArrayList<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (Point point:points) {
            try {
                pointList.add(point.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        try {
            pointList.add(point.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) throws CloneNotSupportedException {
        pointList.add(new Point(x, y).clone());
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double result = 0.0;
        Iterator<Point> iterator = pointList.iterator();
        Point prev = null;
        while (iterator.hasNext()){
            Point current = iterator.next();
            result+= prev != null ? prev.getLength(current) : 0;
            prev =  current;
        }

        return result;
    }

}
