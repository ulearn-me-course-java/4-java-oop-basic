package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points = new Point[0];
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        Point[] ps = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            ps[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = ps;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        int length = points.length;
        Point[] newMass = new Point[ length + 1];
        for (int i = 0; i < length; i++) {
            newMass[i] = new Point(points[i].getX(), points[i].getY());
        }
        newMass[length] = point;
        points = newMass;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        addPoint(point);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double sumLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            sumLength += points[i].getLength(points[i + 1]);
        }
        return  sumLength;
    }

}
