package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private ArrayList<Point> points = new ArrayList<Point>();

    public void setPoints(Point[] p) {
        for(int i = 0; i < p.length; i++){
            try{ points.add(p[i].clone()); }
            catch (CloneNotSupportedException ex) {}
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        try{ points.add(point.clone()); }
        catch (CloneNotSupportedException ex) { }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        try { points.add(point.clone()); }
        catch(CloneNotSupportedException ex) {}
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double res = 0;
        int size = points.size();
        Point[] pointsArr = points.toArray(new Point[size]);

        for(int i = 0; i < size - 1; i++)
                res += pointsArr[i].getLength(pointsArr[i+1]);

        return res;
    }
}