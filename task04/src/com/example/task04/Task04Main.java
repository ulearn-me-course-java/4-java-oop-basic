package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Point p1 = new Point(2,2);
        Point p2 = new Point(4,4);

        Line line = new Line(p1, p2);

        Point pTrue = new Point(3,3);
        Point pFalse = new Point(3,4);

        System.out.println(line.isCollinearLine(pTrue));
        System.out.println(line.isCollinearLine(pFalse));
    }
}
