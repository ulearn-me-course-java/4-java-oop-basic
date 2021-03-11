package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(2, -3), new Point(-3, 4));
        System.out.println(line.isCollinearLine(new Point(5, -1.5)));
        //https://znanija.com/task/912945
    }
}
