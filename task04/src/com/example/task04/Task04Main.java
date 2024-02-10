package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line verticalLine = new Line(new Point(0,0), new Point(0, 5));
        System.out.println(verticalLine.toString());
        for (int x = -1; x < 2; x++){
            for (int y = -1; y < 7; y++){
                Point iterationPoint = new Point(x, y);
                System.out.println("Лежит ли точка "+iterationPoint.toString()+
                        " на прямой "+verticalLine.toString()+":"+verticalLine.isCollinearLine(iterationPoint));
            }
        }

        Line anotherLine = new Line(new Point(0,0), new Point(5, 5));
        System.out.println(anotherLine.toString());
        for (int x = -1; x < 7; x++){
            for (int y = -1; y < 7; y++){
                Point iterationPoint = new Point(x, y);
                System.out.println("Лежит ли точка "+iterationPoint.toString()+
                        " на прямой "+anotherLine.toString()+":"+anotherLine.isCollinearLine(iterationPoint));
            }
        }
    }
}
