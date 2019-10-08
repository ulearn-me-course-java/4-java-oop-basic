package com.example.task04;

public class Task04Main {

    static void checkCollinearLine(Point p, Line l) {
        if (l.isCollinearLine(p)) {
            System.out.println("point = " + p.toString() + " belongs to the line containing the segment " + l.toString());
        } else {
            System.out.println("point = " + p.toString() + " does not belong to the line containing the segment " + l.toString());
        }
    }

    public static void main(String[] args) {
        Line l = new Line(new Point(1, 1), new Point(-1, 2));
        Point p = new Point(0.0, 1.5);
        Point q = new Point(0.0, 1.0);
        checkCollinearLine(p, l);
        checkCollinearLine(q, l);
    }
}
