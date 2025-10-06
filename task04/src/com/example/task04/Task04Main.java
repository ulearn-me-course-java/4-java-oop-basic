package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 3);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);

        Line line = new Line(p1, p2);

        System.out.println(line.isCollinearLine(p3));
    }
}
