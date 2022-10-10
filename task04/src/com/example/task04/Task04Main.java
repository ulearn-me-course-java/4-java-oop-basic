package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);

        Point p3 = new Point(0.25, 0.25);
        Point p4 = new Point(0.8, 0.8);
        Point p5 = new Point(1.5, 1.5);
        Point p6 = new Point(3, 0);


        Line line  = new Line(p1, p2);
        System.out.println(line.isCollinearLine(p3));
        System.out.println(line.isCollinearLine(p4));
        System.out.println(line.isCollinearLine(p5));
        System.out.println(line.isCollinearLine(p6));

    }
}
