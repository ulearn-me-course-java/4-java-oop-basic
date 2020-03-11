package com.example.task05;
import java.util.ArrayList;
/**
 * Ломаная линия
 */
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    ArrayList<Point> points;
    public void setPoints(Point[] points) {
        for(int i = 0;i < points.length;i++)
        {
            this.points.add(points[i]);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        points.add(point);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x,y);
        points.add(point);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        double distance = 0;
        for(int i = 0;i < points.size();i = i++)
        distance += Math.sqrt(Math.pow((points.get(i).x - points.get(i+1).x),2) + Math.pow((points.get(i).y - points.get(i + 1).y),2));
        return distance;
    }

}
