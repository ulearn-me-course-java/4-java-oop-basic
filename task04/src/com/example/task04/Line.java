package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }
    public String toString() {
        return getP1().name + "<->" + getP2().name;
    }
    public boolean isCollinearLine(Point p) {
        if(((p.x - getP1().x)*(getP2().y - getP1().y)-(p.y - getP1().y)*(getP2().x - getP1().x)) == 0)
            if(getP1().x < p.x && p.x < getP2().x && getP1().y < p.y && p.y < getP2().y)
                return true;
        return false;
    }
}
