package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line line = new Line(p1, p2);
        Point p3 = new Point(5, 6);

        System.out.println(line.isCollinearLine(p3));
    }
}
