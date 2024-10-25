package com.example.task04;

public class Line {
    private final Point point1;
    private final Point point2;

    public Line(Point p1, Point p2){
        point1 = p1;
        point2 = p2;
    }

    public Point getP1() {
        return point1;
    }
    public Point getP2() {
        return point2;
    }

    public boolean isCollinearLine(Point point) {
        double dx1 = point2.getX() - point1.getX();
        double dy1 = point2.getY() - point1.getY();
        double dx2 = point.getX() - point1.getX();
        double dy2 = point.getY() - point1.getY();

        return dx1 * dy2 == dy1 * dx2;
    }

    public String toString(){
        return String.format("(%s %s)", point1.toString(), point2.toString());
    }
}
