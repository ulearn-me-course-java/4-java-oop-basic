package com.example.task05;

import java.nio.channels.Pipe;

public class Task05Main {
    public static void main(String[] args) {

        PolygonalLine line = new PolygonalLine();

        line.setPoints(new Point[] {new Point(3, 6), new Point(2, 9)});
        line.addPoint(new Point(1, -1));
        line.addPoint(3, 5);

        System.out.println(new Point(3, 1).getLength(new Point(9, 9)));
        System.out.println(line.getLength());

        for (Point point : line.line){
            System.out.println(point.toString());
        }
    }
}
