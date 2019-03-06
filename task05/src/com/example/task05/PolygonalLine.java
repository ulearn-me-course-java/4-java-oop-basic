package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    List<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point : points)
            addPoint(point);
    }

    public void addPoint(Point point) {
        addPoint(point.getX(),point.getY());
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }


    /** Hасстояние от точки А с координатой x1 формула до точки В с координатой x2 равно модулю разности координат,
     *  то есть |AB| = |x2 - x1|, формула при любом расположении точек на координатной прямой.
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += points.get(i).getLength(points.get(i - 1));
        }
        return length;
    }
}
