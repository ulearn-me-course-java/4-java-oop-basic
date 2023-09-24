package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points = new Point[] {  };

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        Point[] temp = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            temp[i] = new Point(points[i].getX(), points[i].getY());
        }

        this.points = temp;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] temp = new Point[points.length + 1];

        for (int i = 0; i < points.length; i++) {
            temp[i] = new Point(points[i].getX(), points[i].getY());
        }

        temp[temp.length - 1] = new Point(point.getX(), point.getY());
        points = temp;
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
        double length = 0;

        for (int i = 0; i < points.length - 1; i++) {
            length += points[i].getLength(points[i + 1]);
        }

        return length;
    }

}
