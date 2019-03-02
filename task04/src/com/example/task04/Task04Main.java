package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 0), new Point(5, 0));
        Point p1 = new Point(4, 0);
        Point p2 = new Point(1, 1);

        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(p1));
        System.out.println(line.isCollinearLine(p2));
    }
}
