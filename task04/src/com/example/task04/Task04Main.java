package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        boolean isCollinear = new Line(new Point(2, 2), new Point(1, 1)).isCollinearLine(new Point(4, 4));
        System.out.println(isCollinear);
    }
}
