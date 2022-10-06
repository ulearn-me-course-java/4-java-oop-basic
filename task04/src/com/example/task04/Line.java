package com.example.task04;

public class Line {
    private Point firstPoint;
    private Point secondPoint;

    public Point GetP1(){
        return  firstPoint;
    }
    public Point GetP2(){
        return secondPoint;
    }
    public Line(Point p1,Point p2){
        this.firstPoint=p1;
        this.secondPoint=p2;
    }

    public boolean isCollinearLine(Point p){
        double lineLength= firstPoint.distance(secondPoint);
        double firstLength=p.distance(firstPoint);
        double secondLength= p.distance(secondPoint);
        double max,min,med;
        if(secondLength>firstLength){
            if (secondLength > lineLength) {

                max = secondLength;
                if (firstLength > lineLength) {
                    med = firstLength;
                    min = lineLength;
                } else {
                    min = firstLength;
                    med = lineLength;
                }
            } else {
                max = lineLength;
                min = firstLength;
                med = secondLength;
            }
        }
        else {
            if (firstLength > lineLength) {

                max = firstLength;
                if (secondLength > lineLength) {
                    med = secondLength;
                    min = lineLength;
                } else {
                    min = secondLength;
                    med = lineLength;
                }
            } else {
                max = lineLength;
                med = firstLength;
                min = secondLength;
            }
        }
        return max - min - med < Math.pow(0.1, 10);
    }

    public String toString(){
        return this.firstPoint.toString()+" "+ this.secondPoint.toString();
    }
}
