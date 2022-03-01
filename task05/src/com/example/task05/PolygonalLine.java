package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private double lenght = 0;
    private final ArrayList<Point> points = new ArrayList();
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points.clear();
        for(Point point :points){
            addPoint(point);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if(point != null){
            if(points.size() > 0){
                lenght += points.get(points.size()-1).getLength(point);
            }
            this.points.add(point);
        }
        else
            throw new NullPointerException("point is null");
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x,y);
        addPoint(point);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        return this.lenght;
    }

}
