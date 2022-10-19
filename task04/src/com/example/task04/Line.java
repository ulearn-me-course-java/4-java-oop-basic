package com.example.task04;

/**
 * Класс, представляющий из себя отрезок между двумя точками.
 */
public class Line {
    private Point p1;
    private Point p2;

    public Line (Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p){
        return (p.getX() - getP1().getX()) * (getP2().getY() - getP1().getY()) -
                (p.getY() - getP1().getY()) * (getP2().getX() - getP1().getX()) == 0 &&
                ((getP1().getX() < p.getX() && p.getX() < getP2().getX()) || (getP2().getX() < p.getX() && p.getX() < getP1().getX()));
    }

    @Override
    public String toString() {
        return String.format("Line coordinates = {%s},{%s}",getP1().toString(),getP2().toString());
    }
}
