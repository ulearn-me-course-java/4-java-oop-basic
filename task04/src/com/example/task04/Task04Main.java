package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point a = new Point(0,0);
        Point b = new Point(10,10);

        Point x = new Point(4, 4);
        Point y = new Point(-10, -10);

        Line ab = new Line(a, b);
        ab.print();


        if (ab.isCollinearLine(x)){
            System.out.println(x.toString() + " лежит на " + ab.toString());
        }
        else {
            System.out.println(x.toString() + " НЕ лежит на " + ab.toString());
        }

        if (ab.isCollinearLine(y)){
            System.out.println(y.toString() + " лежит на " + ab.toString());
        }
        else {
            System.out.println(y.toString() + " НЕ лежит на " + ab.toString());
        }

    }
}
