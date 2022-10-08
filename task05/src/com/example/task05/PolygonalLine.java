package com.example.task05;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    Point[] points = new Point[]{};
    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++){
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
        // TODO: реализовать
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
      /*  List<Point> list = Arrays.asList(points);
      //  Collections.addAll(list, points);
        list.add(point);
        points = list.toArray(new Point[0]);*/
        if (point != null){
            Point[] p = new Point[points.length + 1];
            for (int i = 0; i < p.length-1; i++){
                p[i] = new Point(points[i].getX(), points[i].getY());
            }
            p[p.length -1] = new Point(point.getX(), point.getY());
            points = p;
          //  Arrays.copyOf(points, points.length+1);
         //   points[points.length-1] = point;
        }

        // TODO: реализовать
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
        // TODO: реализовать
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length-1; i++){
            length += points[i].getLength(points[i+1]);
        }
        return length;
        // TODO: реализовать
     //   throw new AssertionError();
    }

}
