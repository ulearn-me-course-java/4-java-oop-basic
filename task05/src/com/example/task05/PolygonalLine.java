package com.example.task05;
import java.util.ArrayList;
import java.util.List;
public class PolygonalLine {

    private final List<Point> pLine;

    public PolygonalLine()
    {
        this.pLine = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        this.pLine.clear();
        for (Point point : points) addPoint(point);
    }

    public void addPoint(Point point) {
        this.pLine.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        this.pLine.add(new Point(x, y));
    }

    public double getLength()
    {
        double length = 0;
        for (int i = 0; i < pLine.size() - 1; i++)
        {
            Point p1 = pLine.get(i);
            Point p2 = pLine.get(i+1);
            length += p1.getLength(p2);
        }
        return length;
    }

}
