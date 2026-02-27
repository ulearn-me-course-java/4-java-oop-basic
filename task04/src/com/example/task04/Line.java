package com.example.task04;


public class Line {
    private Point p1;
    private Point p2;

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        return p1.distance(p2);
    }

    private double distance(Point p) {
        return Math.abs((p2.getY() - p1.getY()) * p.getX() - (p2.getX() - p1.getX()) * p.getY() + p2.getX() * p1.getY() - p2.getY() * p1.getX()) / this.length();
    }

    public boolean isCollinearLine(Point p) { return distance(p) == 0; }

    @Override
    public String toString() {
        return String.format("(%d, %d)-(%d, %d)", p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
