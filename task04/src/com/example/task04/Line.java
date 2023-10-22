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
    public Point getP2(){
        return p2;
    }

    public boolean isCollinearLine(Point p) {
        double A = p2.y - p1.y;
        double B = p1.x - p2.x;
        double C = p2.x * p1.y - p1.x * p2.y;
        return A * p.x + B * p.y + C == 0;
    }
    public String toString() {
        return "("+"("+p1.x+", "+p1.y+"), "+"("+p2.x+", "+p2.y+")"+")";
    }
}
