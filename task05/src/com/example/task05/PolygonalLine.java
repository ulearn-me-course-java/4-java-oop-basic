package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points=new Point[5000];
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {

        for (int i = 0; i<points.length;i++){
            this.points[i]=new Point(points[i]);
        }

    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        int i =0;
        while (points[i]!=null)
            i++;
       points[i]=new Point(point);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        int i =0;
        while (points[i]!=null)
            i++;
        points[i]=new Point(x, y);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
       double distance = 0;
       int i = 1;
       while (i<points.length && points[i]!=null){
           distance += points[i].getLength(points[i-1]);
           i++;
       }
       return distance;
    }



}
