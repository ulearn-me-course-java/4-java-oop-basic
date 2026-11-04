package com.example.task05;

import java.util.ArrayList;
import java.util.List;

public class PolygonalLine {

    private final List<Point> points = new ArrayList<>();
    //final здесь запрещает заменить саму коллекцию другой ссылкой, но не запрещает добавлять и удалять элементы внутри неё.

    public void setPoints(Point[] points) {
        this.points.clear();

        for (Point point : points) {
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double totalLength = 0;

        for (int i = 1; i < points.size(); i++) {
            totalLength += points.get(i - 1).getLength(points.get(i));
        }

        return totalLength;
    }
}