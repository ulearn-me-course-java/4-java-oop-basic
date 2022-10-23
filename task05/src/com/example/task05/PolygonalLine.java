package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points = new ArrayList<>();
    public PolygonalLine(){

    }
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        List<Point> points1 = new ArrayList<>();
        for (Point p: points
             ) {points1.add(p.copy());
        }
        this.points = points1;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] p = GetPoints();
        Point[] n = new Point[p.length + 1];
        System.arraycopy(p, 0, n, 0, p.length);
        n[p.length] = point.copy();
        setPoints(n);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public Point[] GetPoints()
    {
        Point[] points = new Point[this.points.size()];
        List<Point> ps = this.points;
        for (int i = 0; i < points.length; i++){
            points[i] = ps.get(i);
        }
        return points;
    }
    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double len = 0;
        Point[] points = GetPoints();
        for (int i = 0; i < points.length - 1; i++){
            Point p1 = points[i];
            Point p2 = points[i+1];
            len += p1.getLength(p2);
        }
        return len;
    }
}
