package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        System.out.println(new Line(new Point(0,0), new Point(2,1))
                           .isCollinearLine(new Point(0.5f, 0.25f)));

        System.out.println(new Line(new Point(0,0), new Point(2,1))
                .isCollinearLine(new Point(4, 2)));
    }
}
