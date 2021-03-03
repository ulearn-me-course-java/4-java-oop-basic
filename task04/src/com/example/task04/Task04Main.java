package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(2, 2), new Point(12, 11));
        System.out.println(line.toString());
        Point point = new Point(24,2);
        if (line.isCollinearLine(point)) {
            System.out.println(point.toString()+ " The point lies on the line");
        } else {
            System.out.println(point.toString()+ " The point does not lie on the line");
        }
    }
}
