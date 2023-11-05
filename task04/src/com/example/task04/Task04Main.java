package com.example.task04;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(12,4);
        Point p2 = new Point(15,4);
        Line line = new Line(p1,p2);
        boolean coll = line.isCollinearLine(new Point(13,4));
        System.out.print(coll);
    }
}
