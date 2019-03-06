package com.example.task04;

public class Line {

    private Point p1, p2;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Line(Point x, Point y) {
        this.p1 = x;
        this.p2 = y;
    }

    //Точка Р будет принадлежать отрезку если:
    //1. Векторы (x1, y1) и (x2, y2) коллинеарны (равно нулю их векторное произведение, т.е. (x-x1)(y2-y1)-(y-y1)(x2-x1) = 0
    //2. Абсцисса точки P удовлетворяет условию: clip_image019 или clip_image021. Иначе точка будет находиться на прямой левее или правее отрезка.
    public boolean isCollinearLine(Point p) {
        return ((p.getX() - p1.getX()) * (p2.getY() - p1.getY()) == (p.getY() - p1.getY()) * (p2.getX() - p1.getX())
                &&
                ((p1.getX() < p.getX() && p.getX() < p2.getX()) || (p2.getX() < p.getX() && p.getX() < p1.getX())));
    }

    public String toString() {
        return "(" + p1 + " - " + p2 + ")";
    }
}