package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);
        Line l = new Line(p1,p2);

        System.out.println(l.getP1());
        System.out.println(l.getP2());

        System.out.println(l);

        Point p3 = new Point(2,2);
        System.out.println("is point " + p3 + " on the line " + l + " ?");
        System.out.println(l.isCollinearLine(p3));

        Point p4 = new Point(1,10);
        System.out.println("is point " + p4 + " on the line " + l + " ?");
        System.out.println(l.isCollinearLine(p4));
    }
}