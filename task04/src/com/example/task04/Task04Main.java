package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(-21, -21);
        Line l = new Line(p1, p2);
        System.out.println(l.toString() + l.isCollinearLine(p3));

    }
}
