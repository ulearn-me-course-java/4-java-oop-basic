package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(10, 5), new Point(20, 5));
        System.out.println(line.isCollinearLine(new Point(16, 5)));
    }
}
class Line{
    private Point p1;
    private Point p2;
    public Line(Point p1, Point p2){

        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
    public boolean isCollinearLine(Point p){

        return (p.x - p1.x) * (p2.y - p1.y)  == (p.y - p1.y) / (p2.x - p1.x);
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
final class Point {
    final int x;
    final int y;

    public Point(int x1, int y2){
        x = x1;
        y = y2;
    }
    double distance(Point point){
        int new_x = Math.abs(x - point.x);
        int new_y = Math.abs(y - point.y);

        return  Math.sqrt(new_x * new_x + new_y * new_y);
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
}