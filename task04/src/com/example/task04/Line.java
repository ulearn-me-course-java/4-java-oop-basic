package com.example.task04;

public class Line {
    private final Point point1;

    public Point getPoint1() {
        return point1;
    }

    private final Point point2;

    public Point getPoint2() {
        return point2;
    }

    public Line (Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public String toString () { return String.format("%s,%s",point1.toString(),point2.toString()); }

    public boolean isCollinearLine(Point p) {
        double basicSegment = point1.distance(point2);
        double fromFirstToChecked = point1.distance(p);
        double fromSecondToChecked = point2.distance(p);
        return (basicSegment + fromFirstToChecked == fromSecondToChecked) || (basicSegment + fromSecondToChecked == fromFirstToChecked) ||
                (fromFirstToChecked + fromSecondToChecked == basicSegment); //правило треугольника
    }
}
