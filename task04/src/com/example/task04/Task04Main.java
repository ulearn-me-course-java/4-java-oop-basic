package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Point p1 = new Point(10,3);
        Point p2 = new Point(10,8);

        Line test = new Line(p1, p2);

        Point p3 = new Point(10,7);

        System.out.println(test.isCollinearLine(p3));

        System.out.println(test.toString());

    }
}
