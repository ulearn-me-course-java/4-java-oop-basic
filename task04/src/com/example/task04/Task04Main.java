package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(10, 10), new Point(20, 20));

        System.out.println(l1);
        System.out.println(l1.getP1());
        System.out.println(l1.getP2());

        System.out.println(l1.isCollinearLine(new Point(15, 15)));
        System.out.println(l1.isCollinearLine(new Point(30, 40)));
    }
}
