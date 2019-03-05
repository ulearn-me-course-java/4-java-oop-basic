package com.example.task04;

import static java.lang.System.out;
public class Task04Main {
    public static void main(String[] args) {
        Point point = null;
        Line line = new Line(point, new Point(12, 4));
        out.println(line.isCollinearLine(new Point(10, 8)));
        out.println(line);
    }
}
