package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(4, 10);
        Point p2 = new Point(5, 8);

        Line line = new Line(p1, p2);

        System.out.println(line.toString());

        System.out.println(line.isCollinearLine(new Point(9, 0)));  //true
        System.out.println(line.isCollinearLine(new Point(15, 0))); //false
    }
}
