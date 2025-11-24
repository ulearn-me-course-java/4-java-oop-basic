package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    // Внутреннее хранилище точек. Инициализируем сразу, чтобы избежать NullPointerException
    private List<Point> points = new ArrayList<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        // Очищаем текущий список, если он был заполнен
        this.points.clear();

        // Создаем новые объекты (глубокая копия), чтобы пройти тесты на модификацию
        if (points != null) {
            for (Point p : points) {
                this.points.add(new Point(p.getX(), p.getY()));
            }
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // Создаем новый объект на основе переданного, чтобы защититься от внешних изменений
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
     * Считает сумму длин всех отрезков (расстояний между соседними точками)
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double totalLength = 0;
        // Проходим по списку до предпоследнего элемента
        for (int i = 0; i < points.size() - 1; i++) {
            Point current = points.get(i);
            Point next = points.get(i + 1);
            totalLength += current.getLength(next);
        }
        return totalLength;
    }
}