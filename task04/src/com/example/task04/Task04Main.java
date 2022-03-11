package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
         Point p1 = new Point(5, 3);
        Point p2 = new Point(10, 8);

        Line s = new Line(p1, p2);
        System.out.println(s);

        Point p3 = new Point(0,0);
        boolean b = s.isCollinearLine(p3);
        System.out.println(b);
    }
}
