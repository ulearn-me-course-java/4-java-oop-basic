package com.example.task05;

import com.example.task05.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    List<Point> arrayPoints = new ArrayList<>();
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for(Point point : points){
            arrayPoints.add(point);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        arrayPoints.add(point);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point nPoint = new Point(x, y);
        arrayPoints.add(nPoint);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double lenghtPolyLine = 0;
        for (int i = 0; i < arrayPoints.size() - 1; i++){
            lenghtPolyLine += arrayPoints.get(i).getLength(arrayPoints.get(i + 1));
        }
        return lenghtPolyLine;
    }

}
