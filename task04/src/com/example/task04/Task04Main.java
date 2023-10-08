package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(2, 1), new Point(4, 2));
        System.out.println(line1.isCollinearLine(new Point(-2, -1)));

        Line line2 = new Line(new Point(-2, -1), new Point(4, 2));
        System.out.println(line2.isCollinearLine(new Point(2, 1)));

        Line line3 = new Line(new Point(-2, -1), new Point(2, 1));
        System.out.println(line3.isCollinearLine(new Point(4, 2)));
    }
}
