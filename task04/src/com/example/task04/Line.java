package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point P1, Point P2){
        p1 = P1;
        p2 = P2;
    }

    public Point getP1(){ return p1; }
    public Point getP2() { return p2; }

    public boolean isCollinearLine(Point p){
        int dx1 = this.p2.x - this.p1.x;
        int dy1 = this.p2.y - this.p1.y;
        int dx = p.x - this.p1.x;
        int dy = p.y - this.p1.y;

        int s = dx*dy1 - dy*dx1;

        return s == 0;

    }

    public String toString(){
        return String.format("([%d, %d];[%d, %d])", p1.x, p1.y, p2.x, p2.y);
    }
}
