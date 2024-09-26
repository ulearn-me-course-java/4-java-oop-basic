package com.example.task04;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point p1, Point p2) {
        startPoint = p1;
        endPoint = p2;
    }

    public Point getP1() {
        return startPoint;
    }

    public Point getP2() {
        return endPoint;
    }

    public String toString() {
        return String.format("(%s) (%s)", startPoint.toString(), endPoint.toString());
    }

    public boolean isCollinearLine(Point p) {
        if ((endPoint.getX() - startPoint.getX()) * (p.getY() - startPoint.getY()) - (p.getX() - startPoint.getX()) * (endPoint.getY() - startPoint.getY()) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
