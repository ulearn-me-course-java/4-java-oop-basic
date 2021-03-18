package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    Line (Point p1, Point p2) {
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
        return String.format("[(%d,%d),(%d,%d)]",this.p1.x,this.p1.y,this.p2.x,this.p2.y);
    }
    public boolean isCollinearLine(Point p) {
        if (((p.x - p1.x)*(p2.x - p1.x) - (p.y - p1.y)*(p2.y - p1.y)) != 0 && (p1.x < p.x) && (p2.x > p.x)) {
            return true;
        }
        else {
            return  false;
        }
    }
}
