package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line line = new Line(p1, p2);

        System.out.println(line);

        Point p3 = new Point(2, 3);
        System.out.println("Is collinear: " + line.isCollinearLine(p3));
        Point p4 = new Point(5, 5);
        System.out.println("Is collinear: " + line.isCollinearLine(p4));
    }
}
