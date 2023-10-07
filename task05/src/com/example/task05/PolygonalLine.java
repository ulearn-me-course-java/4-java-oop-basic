package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    Point[] points = new Point[0];

    public PolygonalLine() {

    }

    public void setPoints(Point[] points) {
        Point[] newPolyline = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            newPolyline[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = newPolyline;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] newPolyline = new Point[this.points.length + 1];
        for (int i = 0; i < points.length; i++) {
            newPolyline[i] = new Point(points[i].getX(), points[i].getY());
        }
        newPolyline[newPolyline.length-1] = point;
        this.points = newPolyline;
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
        double PolyLineLength = 0;
        for (int i = 0; i < points.length - 1; i++)
            PolyLineLength += points[i].getLength(points[i + 1]);
        return PolyLineLength;
    }

}
