package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(10, 10));
        Point[] points = {new Point(5, 5), new Point(5, 0), new Point(0, 5), new Point(-5, -5)};
        for (Point point: points) {
            if (line.isCollinearLine(point)) {
                System.out.println("Точка " + point + " принадлежит прямой " + line);
            } else {
                System.out.println("Точка " + point + " не принадлежит прямой " + line);
            }
        }
    }
}
