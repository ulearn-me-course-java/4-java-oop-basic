package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

     private Point[] points;

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
        if (points == null) {
            points = new Point[1];
            points[0] = new Point(point.getX(), point.getY());
        }
        else {
            Point[] newArray;
            newArray = new Point[points.length + 1];

            for (int i = 0; i < points.length; i++) {
                newArray[i] = points[i];
            }
            newArray[points.length] = new Point(point.getX(), point.getY());

            points = newArray;
        }
    }

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
