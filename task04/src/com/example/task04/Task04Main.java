package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
         Point p1 = new Point();
         Point p2 = new Point(4,4);
         Line line = new Line(p1,p2);
            System.out.println(line.isCollinearLine(new Point(2,2)));
    }
}
