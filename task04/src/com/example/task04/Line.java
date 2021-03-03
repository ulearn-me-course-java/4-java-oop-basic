package com.example.task04;

public class Line {

    private Point P1;
    private Point P2;

    public Line(Point P1, Point P2) {
        setP1(P1);
        setP2(P2);
    }

    public Point getP1() {
        return P1;
    }

    public Point getP2() {
        return P2;
    }

    public void setP1(Point p1) {
        P1 = p1;
    }

    public void setP2(Point p2) {
        P2 = p2;
    }

    public boolean isCollinearLine(Point P) {
        return ((P.x - getP1().x) / (getP2().x - getP1().x))
                == (P.y - getP1().y) / ((getP2().y - getP1().y)) ? true : false;
    }

    public String toString() {
        return "(" + getP1().x + "," + getP1().y + ")" + ";" + "(" + getP2().x + "," + getP2().y + ")";
    }
}
