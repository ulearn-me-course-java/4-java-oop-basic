package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);

        Line line = new Line(p1, p2);

        System.out.println(line);

        Point testPoint = new Point(2, 2);
        System.out.println(line.isCollinearLine(testPoint)); // Вывод: true

        Point nonColPoint = new Point(2, 3);
        System.out.println(line.isCollinearLine(nonColPoint)); // Вывод: false
    }
}
