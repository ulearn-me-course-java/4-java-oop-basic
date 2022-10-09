package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point GetP1() {
        return p1;
    }

    public Point GetP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p) {

        int x = p.GetX();
        int y = p.GetY();

        int x1 = p1.GetX();
        int y1 = p1.GetY();

        int x2 = p2.GetX();
        int y2 = p2.GetY();

        if((y-y1)* (x2-x1) == (y2-y1)* (x-x1)){

            return true;
        } else {
            return false;
        }
    }

    public String toString() {

        return String.format("Starting point of a straight line : (%s,%s), the end point of a straight line : (%s,%s)", p1.GetX(), p1.GetY(), p2.GetX(),p2.GetY());
    }
}
