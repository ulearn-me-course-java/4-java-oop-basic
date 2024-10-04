package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return p1.toString() + " - " + p2.toString();
    }

    public boolean isCollinearLine(Point p){
        double slope1 = (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        double slope2 = (double) (p.getY() - p1.getY()) / (p.getX() - p1.getX());

        return slope1 == slope2;
    }
}
