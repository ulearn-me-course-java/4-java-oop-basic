package com.example.task05;

/**
 * Ломаная линия
 */

public class PolygonalLine {

    private Point[] points = new Point[0];

    public PolygonalLine() {

    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        Point[] resultArr = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            resultArr[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = resultArr;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] resArr = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++) {
            resArr[i] = points[i];
        }
        resArr[resArr.length - 1] = new Point(point.getX(), point.getY());
        points = resArr;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double resLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            resLength += points[i].getLength(points[i + 1]);
        }
        return resLength;
    }
}