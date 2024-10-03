package com.example.task04;

public class Task04Main
{
    public static void main(String[] args)
    {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(4, 2);
        Line line = new Line(point1, point2);

        System.out.println(line);

        Point testPoint1 = new Point(2, 1); // На линии
        Point testPoint2 = new Point(1, 0); // Не на линии

        System.out.println("Is point collinear? " + line.isCollinearLine(testPoint1)); // true
        System.out.println("Is point collinear? " + line.isCollinearLine(testPoint2)); // false
    }
}
