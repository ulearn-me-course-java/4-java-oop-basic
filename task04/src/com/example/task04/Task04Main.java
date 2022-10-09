package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(3, 3);

        Line l1 = new Line(p1, p2);
        System.out.println("Line coordinates: " +l1);

        System.out.println(l1.isCollinearLine(p3));
    }
}
