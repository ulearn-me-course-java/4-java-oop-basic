package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points;
    private int size;

    public PolygonalLine() {
        this.points = new Point[10];
        this.size = 0;
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.size = points.length;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (size == points.length) {
            resizeArray();
        }
        points[size++] = new Point(point.getX(), point.getY());
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        if (size == points.length) {
            resizeArray();
        }
        points[size++] = new Point(x, y);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for(int i=1;i<size;i++)
        {
            length+=points[i-1].getLength(points[i]);
        }
        return length;
    }
    public void resizeArray()
    {
        Point[] newPoints = new Point[size*2];
        System.arraycopy(points, 0, newPoints, 0, points.length);
        points = newPoints;
    }

}
