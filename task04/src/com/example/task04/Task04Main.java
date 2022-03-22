package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.println(p1);
        Point p2 = new Point(2, 4);
        System.out.println(p2);
        Point p3 = new Point(3, 6);
        System.out.println(p2);
        Point p4 = new Point(3, 5);
        System.out.println(p2);
        Line line = new Line(p1, p2);
        System.out.println(line);
        System.out.println(line.isCollinearLine(p3));
        System.out.println(line.isCollinearLine(p4));
    }
}
