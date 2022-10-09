package com.example.task05;

import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */

    /**
     * Тестирование модификации массива точек.
     * Если этот метод падает, то скорее всего некорректно реализован метод {@link PolygonalLine#setPoints(Point[])}, который
     * заменяет внутренний массив на переданный. Корректная реализация должна копировать элементы массив, не используя переданный
     * массив в качестве хранилища
     */
    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        System.arraycopy(points, 0, this.points, 0, points.length);
    }
    private Point[] points;

    public PolygonalLine() {
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     *
     *
     *
     * Тестирование модификации массива точек
     * Если этот тест падает, то скорее всего некорректно реализован метод {@link PolygonalLine#addPoint(Point)},
     * который добавляет точку к ломаной без копирования.
     * Корректная реализация должна "копировать" объект для того, чтобы внутреннее состояние ломаной не зависило от
     * внешней модификации ее составляющих точек.
     */
    public void addPoint(Point point) {
        if (this.points == null){
            this.points = new Point[]{point};
        }
        else {
            Point[] temp = this.points;

            this.points = new Point[this.points.length + 1];

            for (int i = 0; i < this.points.length - 1;) {
                for (Point p : temp) {
                    this.points[i] = p;
                    i++;
                }
            }
            this.points[points.length - 1] = point;
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double len = 0;
        for (int i = 0; i < this.points.length - 1; i++) {
            len += points[i].getLength(points[i+1]);
        }

        return len;
    }

}
