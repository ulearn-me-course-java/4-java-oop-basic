package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 0);
        Point p2 = new Point(10, 0);

        Line line = new Line(p1, p2);
        Point p3 = new Point(7, 0);

        System.out.println(p1.distance(p3));
        System.out.println(line.isCollinearLine(p3));
        System.out.println(line.toString());
    }
}
