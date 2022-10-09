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
    private final ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point:points) {
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }


    public PolygonalLine() {}

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     *
     *
     *
     * Тестирование модификации массива точек
     * Если этот тест падает, то скорее всего некорректно реализован метод {@link PolygonalLine#addPoint(Point)},
     * который добавляет точку к ломаной без копирования.
     * Корректная реализация должна "копировать" объект для того, чтобы внутреннее состояние ломаной не зависило от
     * внешней модификации ее составляющих точек.
     */
    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
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
        double len = 0;
//        for (int i = 0; i < this.points.length - 1; i++) {
//            len += points[i].getLength(points[i+1]);
//        }
        for (int i = 0; i < this.points.size() - 1; i++) {
            len += this.points.get(i).getLength(this.points.get(i + 1));
        }
        return len;
    }

}
