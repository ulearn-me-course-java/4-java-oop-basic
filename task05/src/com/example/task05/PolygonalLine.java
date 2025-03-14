package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {
    private final ArrayList<Point> Line;

    public PolygonalLine() {
        Line = new ArrayList<>();
    }
    public void setPoints(Point[] points) {
        for (Point p : points) {
            addPoint(p);
    }


    public void addPoint(Point point) {
            Line.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
            Line.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {

            double lenght = 0;
            for (int i = 0; i < Line.size() - 1; i++) {
                Point first = Line.get(i);
                Point second = Line.get(i + 1);
                lenght += first.getLength(second);
            }

            return lenght;
    }

}
