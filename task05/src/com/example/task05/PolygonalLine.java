package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */

    private ArrayList<Point> line;

    public void setPoints(Point[] points) {
        for(Point p : points){
            addPoint(p);
        }
    }

    public PolygonalLine(){
        line = new ArrayList<>();
    }

    /**
     * Добавляет точку к ломаной линии
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        line.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        line.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for(int i = 1; i < line.size(); i++){
            Point one = line.get(i - 1);
            Point two = line.get(i);
            length += one.getLength(two);
        }
        return  length;
    }

}
