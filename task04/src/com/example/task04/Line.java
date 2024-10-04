package com.example.task04;

public class Line {

    private  Point p1;
    private  Point p2;


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
        return String.format("Line: %s - %s", p1, p2);
    }

    public boolean isCollinearLine(Point p) {
        // Используем уравнение прямой, проходящей через две точки: (y2 - y1)(x - x1) = (y - y1)(x2 - x1)
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        int x = p.getX();
        int y = p.getY();


        return (y2 - y1) * (x - x1) == (y - y1) * (x2 - x1);
    }
}
