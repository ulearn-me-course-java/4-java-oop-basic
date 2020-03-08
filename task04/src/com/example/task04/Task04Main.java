package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line omega = new Line(new Point(10, 10), new Point(20, 20));
        System.out.println(omega.toString());
        System.out.println(omega.isCollinearLine(new Point(15, 14)));


    }
}
class Point {
    final int x;
    final int y;


    Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    Point flip(){
        return new Point(this.y*(-1),this.x*(-1));
    }

    double distance(Point point){
        return Math.sqrt(Math.pow((point.x-this.x),2)+Math.pow((point.y-this.y),2));
    }

    public String toString(){
        return "("+this.x+" , "+y+")";
    }

}

class Line {

    private Point start;
    private Point end;

    Line(Point start,Point end){
        this.start = start;
        this.end = end;
    }
    Line(){

    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public boolean isCollinearLine(Point p){
        return ((p.x - start.x) * (end.y - start.y) - (end.x - start.x) * (p.y - start.y) == 0) ;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
