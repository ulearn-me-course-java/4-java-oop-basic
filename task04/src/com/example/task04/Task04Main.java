package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(3,3), new Point(7,7));
        System.out.println(line.isCollinearLine(new Point(5,5))); //correct
        System.out.println(line.toString());
    }
}
