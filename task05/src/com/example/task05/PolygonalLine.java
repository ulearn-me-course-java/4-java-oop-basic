package com.example.task05;
/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points = {};

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for( Point point : points){
            addPoint(new Point(point.getX(), point.getY()));
        }
    }

    /**
     @@ -20,27 +24,38 @@ public void setPoints(Point[] points) {
      * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] temp = new Point[this.points.length + 1];
        System.arraycopy(this.points, 0, temp, 0, this.points.length);
        temp[this.points.length] = new Point(point.getX(), point.getY());
        this.points = temp;
    }


    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point[] temp = new Point[this.points.length + 1];
        System.arraycopy(this.points, 0, temp, 0, this.points.length);
        temp[this.points.length] = new Point(x, y);
    }


    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double lineLenght = 0.0;

        for (int i = 0; i < this.points.length - 1; i++) {
            lineLenght += points[i].getLength(points[i+1]);
        }
        return lineLenght;
    }

}