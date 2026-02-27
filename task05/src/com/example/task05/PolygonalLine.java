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
        if (points == null) { throw new NullPointerException("Массив точек не должен быть null"); }
        if (points.length == 0) { throw new IllegalArgumentException("Массив точек не должен быть пустым!"); }

        Point[] values = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            double x = points[i].getX();
            double y = points[i].getY();
            values[i] = new Point(x, y);
        }

        this.points = values;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (points == null) {
            points = new Point[] {point};
            return;
        }

        Point[] pointsWithAddedPoint = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++) {
            double x = points[i].getX();
            double y = points[i].getY();
            pointsWithAddedPoint[i] = new Point(x, y);
        }
        pointsWithAddedPoint[pointsWithAddedPoint.length - 1] = new Point(point.getX(), point.getY());
        points = pointsWithAddedPoint;
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
        double length = 0.0;

        for (int i = 1; i < points.length; i++) {
            length += points[i].getLength(points[i-1]);
        }

        return length;
    }
}
