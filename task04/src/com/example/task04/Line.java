package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 =p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public String toString(){
        return String.format("p1 : %s, p2 : %s", p1,p2);
    }
    public boolean isCollinearLine(Point p){
        if ((p.findX()- p1.findX())/(p2.findX()-p1.findX()) == (p.findY()- p1.findY())/(p2.findY()-p1.findY())){
            return true;
        }
        else {
            return false;
        }
    }


}
