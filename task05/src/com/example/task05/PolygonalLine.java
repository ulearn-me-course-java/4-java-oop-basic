package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private ArrayList<Point> points = new ArrayList<Point>();
    private ArrayList<Line> lines = new ArrayList<Line>();




    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (Point p:
             points) {
            this.points.add(new Point(p.getX(), p.getY()));
        }

    }

    public void setLines(Line[] line){
        for (Line l:
             lines) {
            this.lines.add(new Line(l.getStart(), l.getEnd()));
        }
    }



    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addLine(Line line) {lines.add(new Line(line.getStart(), line.getEnd()));}

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public void addLine(Point start, Point end) { lines.add(new Line(start, end)); }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for(int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).getLength(points.get(i + 1));
        }
        return length;
    }

    public double getLengths() {
        double length = 0;
        for(int i = 0; i < lines.size(); i++) {
            length += lines.get(i).distance(lines.get(i));
        }
        return length;
    }

}
