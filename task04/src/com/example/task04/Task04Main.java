package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(2, 2); // лежит
        Point p4 = new Point(3, 5); // не лежит

        Line line = new Line(p1, p2);
        System.out.println(line.toString());
        System.out.println("Lezit na pryamoy? " + line.isCollinearLine(p3));
        System.out.println("Lezit na pryamoy? " + line.isCollinearLine(p4));

    }
}
