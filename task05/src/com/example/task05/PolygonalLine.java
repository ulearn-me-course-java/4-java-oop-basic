package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points = new ArrayList<>();

    PolygonalLine(Point[] points) {
        setPoints(points);
    }

    /**
     * Устанавливает точки ломаной линии
     * Если объект уже содержит какие-либо точки (поле points не пусто), точки не будут установлены
     * Для добавления новых точек к ломанной рекомедуется использовать метод addPoint
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        if(points == null){
            trow new NullPointerException();
        }
        if (this.points.isEmpty()) {
            for (Point p : points) {
                this.points.add(new Point(p.getX(), p.getY()));
            }
        } else {
            System.out.println("The field \"points\" is already initialized. \nIf you want to add new points use the method \"addPoint\"");
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if(point == null){
            trow new NullPointerException();
        }
        this.points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 0; i < this.points.size() - 1; i++) {
            length += this.points.get(i).getLength(this.points.get(i + 1));
        }
        return length;
    }

}
