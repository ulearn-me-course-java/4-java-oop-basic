package com.example.task04;

public class Line {
    private final Point Point1;
    private final Point Point2;


    public Line(Point Point1, Point Point2) {
        this.Point1 = Point1;
        this.Point2 = Point2;
    }


    public Point getPoint1() {
        return Point1;
    }


    public Point getPoint2() {
        return Point2;
    }


    public String toString() {
        return String.format("%s", Point1.toString()+Point2.toString());
    }

    public boolean isCollinearLine(Point p) {
        int x1 = Point1.getX();
        int y1 = Point1.getY();
        int x2 = Point2.getX();
        int y2 = Point2.getY();
        int x = p.getX();
        int y = p.getY();

        return (y2 - y1) * (x - x1) == (y - y1) * (x2 - x1);
    }
}
