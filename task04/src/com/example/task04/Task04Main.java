package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 10);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(10, 0);
        Line l = new Line(p1, p2);
        System.out.println(l.isCollinearLine(p3));
        System.out.println(l.getP2());
    }
}
