package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(-2,2), new Point(2,2));
        System.out.println(line);

        Point p1 = line.getP1();
        System.out.println(p1);

        Point p3 = new Point(0,2);

        System.out.println(line.isCollinearLine(p3));
    }
}

