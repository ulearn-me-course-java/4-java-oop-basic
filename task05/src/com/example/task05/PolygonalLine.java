package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points.clear();
        if(points != null){
            for (Point point : points){
                if (point != null){
                    addPoint(point);
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
        if (point != null) {
            // Создаем КОПИЮ, а не сохраняем оригинальный объект
            points.add(new Point(point.getX(), point.getY()));
        }
        //Без создания копий, если кто-то извне изменяет Point
        //объекты (через reflection или если бы поля не были final)
        //это повлияет на ломаную линию.

    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;

        for (int i = 0; i < points.size() - 1; i++){
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            length += p1.getLength(p2);
        }
        return length;
    }

}
