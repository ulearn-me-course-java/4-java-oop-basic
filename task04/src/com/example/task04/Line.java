package com.example.task04;

public class Line {

    private final Point p1;
    private final Point p2;

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
        return "Отрезок от" + p1 + "до " + p2;
    }

    //(y₃ - y₁) × (x₂ - x₁) = (x₃ - x₁) × (y₂ - y₁), где A(x1, y1) и B(x2, y2) точки прямой, а C(x3, y3) точка, которую надо проверить
    public boolean isCollinearLine(Point p){
        return ((p.getY() - p1.getY()) * (p2.getX() - p1.getX())) == ((p.getX() - p1.getX()) * (p2.getY() - p1.getY()));
    }
}
