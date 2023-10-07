package com.example.task04;
import com.example.*;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0,0), new Point(10, 0));
        System.out.println(line.isCollinearLine(new Point(5, 1)));
        System.out.println(line.isCollinearLine(new Point(5, 0)));
    }
}
