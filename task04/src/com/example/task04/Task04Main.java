package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        Line line = new Line(new Point(-4, -2), new Point(3, 1.5));
        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(new Point(0, 0)));
    }

}
