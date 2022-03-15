package com.example.task05;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private ArrayList<Point> points = new ArrayList<>();

    //Устанавливает точки ломаной линии
    public void setPoints(Point[] points) {
        for( Point i : points) {
            this.points.add(new Point(i.getX(), i.getY()));
        }
    }


    //Добавляет точку к ломаной линии
    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        points.add(point);
    }

    //Возвращает длину ломаной линии
    public double getLength() {
        if(points.size() < 2)
            return 0;
        double size = 0;
        for(int i = 1; i < points.size(); i++) {
            size += points.get(i).getLength(points.get(i - 1));
        }
        return size;
    }

}
