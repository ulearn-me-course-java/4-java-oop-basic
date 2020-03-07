package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(10, 20), new Point(11, 21));
        System.out.println(line);
        Point point = new Point(10, 40);
        if(line.isCollinearLine(point)){
            System.out.println("True bro");
        }
        else System.out.println("False");
    }
}
