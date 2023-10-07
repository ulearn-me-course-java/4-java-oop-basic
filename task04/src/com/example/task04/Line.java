package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return String.format("Point 1:(%s;%s) , Point 2:(%s,%s)", this.p1.getX(),this.p1.getY(), this.p2.getX(), this.p2.getY());
    }

    public boolean isCollinearLine(Point p){
        return p1.distance(p2)==p.distance(p1)+p.distance(p2);
    }
}
