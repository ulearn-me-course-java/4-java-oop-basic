package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points;

    public PolygonalLine() {
        points = new Point[]{};
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) this.points[i] = new Point(points[i].getX(), points[i].getY());
        //для предотвращения случайного изменения данных
    }


    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] newPoints = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++) newPoints[i] = points[i];
        newPoints[newPoints.length - 1] = new Point(point.getX(), point.getY());
        points = newPoints;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point[] newPoints = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++)
            newPoints[i] = points[i];
        newPoints[newPoints.length - 1] = new Point(x, y);
        points = newPoints;
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double len = 0;
        for (int i = 0; i < points.length - 1; i++) len += points[i].getLength(points[i + 1]);
        return len;
    }

}
