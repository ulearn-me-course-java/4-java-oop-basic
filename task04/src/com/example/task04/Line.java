package com.example.task04;

import java.awt.*;

public class Line {

    private Point p1;
    public Point getP1() {
        return p1;
    }

    private Point p2;

    public Point getP2() {
        return p2;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Line{ " +
                "p1= " + p1.toString() +
                ", p2=" + p2.toString() +
                " }";
    }

    public boolean isCollinearLine(Point p){
        return ((p.x - p1.x)*(p2.y - p1.y) - (p.y - p1.y)*(p2.x - p1.x) == 0) &&        // векторы колинеарны (параллельны, векторное произведение равно нулю)
                ((p1.x <= p.x) && (p.x <= p2.x) || (p1.x >= p.x) && (p.x >= p2.x)) &&   // не левее / правее на плоскости
                ((p1.y <= p.y) && (p.y <= p2.y) || (p1.y >= p.y) && (p.y >= p2.y));     // не выше  / ниже на плоскости
    }
}
