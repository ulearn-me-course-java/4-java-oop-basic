package com.example.task05;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonalLine {

    private ArrayList<Point> line;

    public PolygonalLine() {
        line = new ArrayList<>();
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
       for (Point i : points) {
           addPoint(i);
       }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        line.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        line.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double lenght= 0;

        if (line.size() < 1) return 0;
        else {
            for (int i = 1; i < line.size(); i++) {
                Point point1 = line.get(i - 1);
                Point point2 = line.get(i);
                lenght += point1.getLength(point2);
            }
            return lenght;
        }
    }

}
