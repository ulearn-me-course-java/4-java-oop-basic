package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Point p1 = new Point(0,0);
        Point p2 = new Point(2,2);
        Point p = new Point(1,8);

        Line l = new Line(p1,p2);
        System.out.println(l.isCollinearLine(p));

        System.out.println(l.toString());

    }
}
