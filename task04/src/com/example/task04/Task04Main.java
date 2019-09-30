package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Point a = new Point(3.3,3.3);
        Point b = new Point(0,0);
        Line line = new Line(a,b);
        System.out.println(line.isCollinearLine(new Point(0,0)));
        System.out.println(line.isCollinearLine(new Point(2.2, 2.2)));
        System.out.println(line.isCollinearLine(new Point(100, 2)));
        System.out.println(line.isCollinearLine(new Point(-1, -1)));
    }
}
