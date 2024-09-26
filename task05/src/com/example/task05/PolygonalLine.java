package com.example.task05;

import java.util.ArrayList;


/**
 * Ломаная линия
 */
public class PolygonalLine {
    private final ArrayList<Point> line;

    public PolygonalLine(){
        this.line = new ArrayList<>();
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
        Point pt = new Point(point.getX(), point.getY());
        this.line.add(pt);

    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        this.line.add(point);

    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {


        if (this.line.size() < 2)
            return 0;
        double length = 0;
        for (int i = 0; i < line.size() - 1; i++){
            Point p1 = line.get(i);
            Point p2 = line.get(i + 1);
            length += p1.getLength(p2);
        }
        return length;
    }

}
