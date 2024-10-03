package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(4, 4);
        Point c = new Point(2, 2);
        Line line = new Line(a, b);
        if (line.isCollinearline(c)){
            System.out.println("Точка " + c.toString()+ " лежит на прямой содержащей отрезок " + line.toString());
        }
        else {
            System.out.println("Точка " + c.toString()+ " не лежит на прямой содержащей отрезок " + line.toString());
        }
    }
}
