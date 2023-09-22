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
    private Point[] points = new Point[]{};
    public void setPoints(Point[] points) {
        Point[] newPoints = new Point[points.length];
        for (int i=0;i<points.length;i++) {
            newPoints[i]=new Point( points[i].getX(),points[i].getY());
        }
        this.points = newPoints;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] newPoints = new Point[points.length+1];
        for (int i=0;i<points.length;i++) {
            newPoints[i]=points[i];
        }
        newPoints[newPoints.length-1] = point;

        setPoints(newPoints);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x,y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double res = 0d;
        for (int i=0;i<points.length-1;i++) {
            res+=points[i].getLength(points[i+1]);
        }
        return res;
    }
}
