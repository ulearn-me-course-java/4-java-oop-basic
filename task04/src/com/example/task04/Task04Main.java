package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,5);
        Point p2 = new Point(3,9);
        Line  l = new Line(p1,p2);
        System.out.println(l);
        System.out.println(l.isCollinearLine(new  Point(-4,3)));

    }
}
