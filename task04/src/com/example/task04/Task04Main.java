package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(1, 2);

        Line line = new Line(p1, p2);

        System.out.println("Line: " + line);
        System.out.println("Point p3 " + p3 + " is collinear: " + line.isCollinearLine(p3));
        System.out.println("Point p4 " + p4 + " is collinear: " + line.isCollinearLine(p4));
    }
}