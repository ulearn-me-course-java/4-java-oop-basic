package com.example.task02;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

/**
 * Создайте класс TimeSpan, который будет хранить временной интервал в часах, минутах и секундах (каждый в отдельном поле)
 * Все поля должны быть объявлены как private, т.е. скрыты от прямого доступа снаружи.
 * Для каждого поля добавить пару public методов, один из которых будет получать (get) значение поля, другой - выставлять (set).
 * Для класса нужно описать конструктор, который принимает на вход три параметра и инициализирует свое состояние по ним.
 * Класс должен корректно работать со временем. Например, при получении 100 минут должен преобразовывать их в 1 час 40 минут.
 */
public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;

        while(seconds >= 60) {
            seconds -= 60;
            minutes += 1;
        }
        while(minutes >= 60) {
            minutes -= 60;
            hours += 1;
        }
    }

    public int getHours() {
        return this.hours;
    }
    public void setHours(int value) {
        this.hours = value;
    }

    public int getMinutes() {
        return this.minutes;
    }
    public void setMinutes(int value) {
        this.minutes = value;
    }

    public int getSeconds() {
        return this.seconds;
    }
    public void setSeconds(int value) {
        this.seconds = value;
    }

    //Добавьте метод, который должен прибавлять к текущему интервалу значение переданного интервала
    void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
    }

    //Добавьте метод, который должен вычитать из текущего интервала значение переданного интервала
    void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
    }

    //Добавьте метод, который должен возвращать строковое представление интервала в любом удобном виде
    public String toString() {
        return String.format("%s hours, %s minutes, %s seconds", hours, minutes, seconds);
    }
}
