package com.example.task04;

import static java.lang.System.out;
public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(9, 10), new Point(12, 4));
        out.println(line.isCollinearLine(new Point(10, 8)));
        out.println(line);
    }
}
