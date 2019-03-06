package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        Line l = new Line(p1, p2);
        System.out.println(l);
        System.out.println(l.isCollinearLine(new Point(2, 2)));
    }
}
