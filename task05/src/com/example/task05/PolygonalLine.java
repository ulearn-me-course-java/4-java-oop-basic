package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private List<Point> points;

    public PolygonalLine(Point[] points){
        this.points = Arrays.asList(points);
    }

    public PolygonalLine(){
        this.points = new ArrayList<>();
    }

    public List<Point> getPoints() {
        return points;
    }
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (Point point : points) {
            addPoint(point);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        getPoints().add(new Point(point.getX(),point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        getPoints().add(new Point(x,y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        if (getPoints().size() == 0){
            return 0;
        }

        double length = 0;

        Point currentPoint = getPoints().get(0);
        for (int i = 1; i < getPoints().size(); i++){
            length += currentPoint.getLength(getPoints().get(i));
            currentPoint = getPoints().get(i);
        }
        return length;
    }

}
