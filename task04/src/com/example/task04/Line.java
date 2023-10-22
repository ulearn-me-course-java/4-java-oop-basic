package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return String.format("Point1(%s, %s), Point2(%s, %s)", this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
    }

    public boolean isCollinearLine(Point p) {
        double distance1 = Math.sqrt(Math.pow(p1.getX() - p.getX(), 2) + Math.pow(p1.getY() - p.getY(), 2));
        double distance2 = Math.sqrt(Math.pow(p2.getX() - p.getX(), 2) + Math.pow(p2.getY() - p.getY(), 2));
        double distance3 = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));

        return Math.abs((distance1 + distance2) - distance3) < 0.00001;
    }
}
