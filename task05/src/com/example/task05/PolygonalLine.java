package com.example.task05;
import java.util.ArrayList;
import java.util.List;

public class PolygonalLine {

    private final ArrayList<Point> Line;

    public PolygonalLine(){

        Line = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for (Point p : points){
            addPoint(p);
        }
    }

    public void addPoint(Point point) {
        Line.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        Line.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 1; i < this.Line.size(); i++){
            Point first = Line.get(i - 1);
            Point second = Line.get(i);
            length += getDistance(first, second);
        }
        return length;
    }
    public double getDistance(Point first, Point seconds){
        double dx = first.getX() - seconds.getX();
        double dy = first.getY() - seconds.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}