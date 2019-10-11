package com.example.task04;

public class Line {
    private Point pnt1;
    private Point pnt2;

    Line(Point pnt1, Point pnt2) {
        this.pnt1 = pnt1;
        this.pnt2 = pnt2;
    }

    public Point getPnt1() {
        return pnt1;
    }

    public Point getPnt2() {
        return pnt2;
    }

    public void setPnt1(Point pnt1) {
        this.pnt1 = pnt1;
    }

    public void setPnt2(Point pnt2) {
        this.pnt2 = pnt2;
    }

    public String toString() {
        return "[" + pnt1.toString() + ";" + pnt2.toString() + "]";
    }

    public boolean isCollinearLine(Point p) {
        long y1 = (p.x - this.getPnt1().x) / (this.getPnt2().x - this.getPnt1().x);
        long y2 = (p.y - this.getPnt1().y) / (this.getPnt2().y - this.getPnt1().y);
        return y1 == y2;
    }

}
