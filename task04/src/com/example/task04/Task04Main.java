package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Line line = new Line(new Point(1, 1), new Point(4, 4));
        System.out.println(line.toString());

        Point p1 = new Point(3, 3);
        System.out.println(line.isCollinearLine(p1));

        Point p2 = new Point(3, 1);
        System.out.println(line.isCollinearLine(p2));
    }
}
