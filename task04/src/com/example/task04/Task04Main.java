package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l1 = new Line(p1, p2);
        System.out.println(l1.isCollinearLine(new Point(5, 6)));
        System.out.println(l1.isCollinearLine(new Point(1, 2)));
        System.out.println(l1.isCollinearLine(new Point(3, 4)));
        System.out.println(l1.isCollinearLine(new Point(7, 8)));
        System.out.println(l1.isCollinearLine(new Point(-1, 0)));
        System.out.println(l1.isCollinearLine(new Point(0, 0)));
    }
}
