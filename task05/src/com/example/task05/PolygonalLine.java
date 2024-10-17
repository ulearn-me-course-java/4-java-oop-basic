package com.example.task05;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    public ArrayList<Point> PointsList;
    public ArrayList<Point> newPointsList;

    public PolygonalLine() {
        PointsList = new ArrayList<>();
        newPointsList = new ArrayList<>();
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param pointsArray массив точек, которыми нужно проинициализировать ломаную линию
     */

    public void setPoints(Point[] pointsArray) {
        Collections.addAll(PointsList, pointsArray);
        Collections.addAll(newPointsList, pointsArray);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        newPointsList.add(point);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point newPoint = new Point(x,y);
        newPointsList.add(newPoint);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double totalLength = 0;
        for (int i=0;i<PointsList.size()-1;i++)
        {
            Point currentPoint = PointsList.get(i);
            Point nextPoint = PointsList.get(i+1);

            totalLength+=currentPoint.getLength(nextPoint);
        }
        System.out.println(totalLength);
        return totalLength;

    }
}
