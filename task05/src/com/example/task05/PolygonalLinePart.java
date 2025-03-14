
package com.example.task05;

public class PolygonalLinePart {
    private Point p1;
    private Point p2;
    public PolygonalLinePart nextLinePart;
    public PolygonalLinePart previousLinePart;
    public PolygonalLinePart(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void linkToNextLine(PolygonalLinePart polygonalLinePart){
        nextLinePart = polygonalLinePart;
        polygonalLinePart.previousLinePart = this;
    }

    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
    public String toString(){
        return "["+p1.toString()+";"+p2.toString()+"]";
    }
}