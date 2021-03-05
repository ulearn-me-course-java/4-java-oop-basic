package com.example.task04;

public class Line {
    private Point firstPoint;
    private Point secondPoint;

    public Line(Point p1, Point p2) {
        firstPoint = p1;
        secondPoint = p2;
    }

    public Point getP1() {
        return firstPoint;
    }

    public Point getP2() {
        return secondPoint;
    }

    public boolean isCollinearLine(Point p) {
        int x = p.getX();
        int y = p.getY();
        int x1 = firstPoint.getX();
        int y1 = firstPoint.getY();
        int x2 = secondPoint.getX();
        int y2 = secondPoint.getY();

        return isCollinear(x1, y1, x2, y2, x, y) || isCollinear(x2, y2, x1, y1, x, y);
    }

    private boolean isCollinear(int x1, int y1, int x2, int y2, int x, int y) {
        return x1 <= x && x <= x2 && (x - x1) * (y2 - y1) == (y - y1) * (x2 - x1);
    }

    public String toString() {
        return String.format("%s - %s", firstPoint.toString(), secondPoint.toString());
    }
}
