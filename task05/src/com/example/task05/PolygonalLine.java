package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points;

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points = points;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] newPoints = new Point[points.length + 1];

        for (int i = 0; i < points.length; i++) {
            newPoints[i] = points[i];
        }

        newPoints[points.length] = point;
        this.points = newPoints;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point[] newPoints = new Point[points.length + 1];
        Point point = new Point(x, y);

        for (int i = 0; i < points.length; i++) {
            newPoints[i] = points[i];
        }

        newPoints[points.length] = point;
        this.points = newPoints;
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        Point tempPoint = points[0];
        double length = 0;

        for(Point p : points) {
            length += tempPoint.getLength(p);
            tempPoint = p;
        }

        return length;
    }

}
