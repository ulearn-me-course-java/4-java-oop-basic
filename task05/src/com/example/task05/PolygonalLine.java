package com.example.task05;

import sun.security.util.Length;
import java.util.ArrayList;
import java.util.List;
/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points;

    public PolygonalLine() {
        this.points = new Point[0];  // Создаем пустой массив точек
    }

    public PolygonalLine(Point[] points) {
        if (points == null) {
            this.points = new Point[0];
        } else {
            this.points = new Point[points.length];

            for (int i = 0; i < points.length; i++){
                if(points[i] != null){
                    this.points[i] = new Point(points[i].getX(), points[i].getY());
                }
            }
        }
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        // TODO: реализовать
        if (points == null) {
            this.points = new Point[0];
        } else {
            this.points = new Point[points.length];
            for (int i = 0; i < points.length; i++) {
                if (points[i] != null) {
                    this.points[i] = new Point(points[i].getX(), points[i].getY());
                }
                }
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // TODO: реализовать
        if (point == null) return;

        Point newPoin = new Point(point.getX(), point.getY());

        Point[] newPoint = new Point[points.length+1];

        for (int i = 0; i < points.length; i++){
            newPoint[i] = points[i];
        }
        newPoint[points.length] = newPoin;
        points = newPoint;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        Point point = new Point(x, y);
        addPoint(point);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        if (points.length < 2) return 0.0;

        double lineLength = 0.0;

        for (int i = 0; i < points.length - 1; i++){
            lineLength += points[i].getLength(points[i + 1]);
        }
        return lineLength;
    }

}
