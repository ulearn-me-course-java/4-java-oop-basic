package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2 );
        Point p2 = new Point(2,4);
        Line l = new Line(p1, p2);
        System.out.println(l.toString());
        Point p3 = new Point(3,6);
        System.out.println(l.isCollinearLine(p3));
    }
}
