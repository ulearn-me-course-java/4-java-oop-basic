package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 1), new Point(1, 4));
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 2);

        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(p1));
        System.out.println(line.isCollinearLine(p2));
    }
}
