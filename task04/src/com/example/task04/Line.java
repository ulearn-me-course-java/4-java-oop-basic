package com.example.task04;

public class Line {
    private Point point1;
    private Point point2;

    Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
    public Point getP1() {
        return point1;
    }
    public Point getP2() {
        return point2;
    }
    public boolean isCollinearLine(Point p){
        return Math.abs((point1.x - p.x) / (point1.y - p.y)) - ((point2.x - p.x) / (point2.y- p.y)) < 0.001;
    }
    public String toString() {
        String point1ToString = String.format("(%d, %d)", getP1().x, getP1().y);
        String point2ToString = String.format("(%d, %d)", getP2().x, getP2().y);
        return "Начало отрезка: " + point1ToString + " Конец отрезка: " + point2ToString;
    }
}
