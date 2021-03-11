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
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++){
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] arr = new Point[points.length + 1];
        int i = 0;
        for (; i < points.length; i++){
            arr[i] = new Point(points[i].getX(), points[i].getY());
        }
        arr[i] = new Point(point.getX(), point.getY());
        points = arr;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point[] arr = new Point[points.length + 1];
        int i = 0;
        for (; i < points.length; i++){
            arr[i] = points[i];
        }
        arr[i] = new Point(x, y);
        points = arr;
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length-1; i++) {
            length += points[i].getLength(points[i+1]);
        }
        return length;
    }

}
