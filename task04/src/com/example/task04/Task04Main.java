package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(6, 5);
        Point p3 = new Point(-10, 0);
        Point p4 = new Point(0, 10);
        Line line = new Line(p1, p2);

        System.out.println(line.isCollinearLine(p3));
        System.out.println(line.isCollinearLine(p4));
    }
}
