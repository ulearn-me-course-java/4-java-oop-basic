package com.example.task05;
import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private final ArrayList<Point> points;

    public void setPoints(Point[] points) {
        for (Point point :
                points) {
            addPoint(point);
        }
    }

    public PolygonalLine() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        Point prevPoint = null;
        for (Point point :
                points) {
            if (prevPoint == null) {
                prevPoint = point;
                continue;
            }
            length += point.getLength(prevPoint);
            prevPoint = point;
        }
        return length;
    }

}
