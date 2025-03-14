package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(0,0), new Point(5,5));
        Point[] points = new Point[7];
        for (int i = 0; i < 6; i++) {
            points[i] = new Point(i,i);
        }
        points[6] = new Point(1,2);
        for (Point point: points) {
            System.out.println(line1+" | isCollinearLine("+point+"): "+line1.isCollinearLine(point));
        }
    }
}
