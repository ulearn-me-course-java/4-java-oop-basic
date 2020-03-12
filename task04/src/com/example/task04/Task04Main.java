package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(20, 22);
        Point p2 = new Point( 10, 20);
        Line line = new Line(p1, p2);

        System.out.println(line.getP1());
        System.out.println(line.getP2());

        Point p3 = new Point(15, 21);
        System.out.println(line.isCollinearLine(p3));
    }
}
