package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points = {};

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        Point[] newPoints = new Point[points.length];
        for (int i = 0; i < points.length; i++){
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = newPoints;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] newPoints = new Point[this.points.length + 1];
        for (int i = 0; i < points.length; i++){
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        newPoints[this.points.length] = point;
        this.points = newPoints;
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
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++){
            sum += points[i].getLength(points[i + 1]);
        }
        return sum;
    }

}
