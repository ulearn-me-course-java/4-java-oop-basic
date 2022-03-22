package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    // конструктор
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    //Для доступа к точкам
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    // для формирования строкового представления объекта отрезка
    public String toString() {
        return String.format("(%d, %d) %s (%d, %d)", p1.x, p1.y,
                "-".repeat((int) Math.ceil(p1.distance(p2))), p2.x, p2.y);
    }

    public boolean isCollinearLine(Point p) {
        int k = (p2.y - p1.y) / (p2.x - p1.x);
        int b = p2.y - k * p1.x;

        if (p.y == p.x * k + b)
            return true;
        return false;
    }
}
