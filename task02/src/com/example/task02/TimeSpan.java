package com.example.task02;

    /*  set - задавать
        get - получать,
        студент аки сервак,
        упал.
    */

public class TimeSpan {

    private int second;
    private int minute;
    private int hour;

    /*Для каждого поля добавить пару public методов,
    один из которых будет получать (get) значение поля, другой - выставлять (set). */

    public int getSecond() {
        return second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public TimeSpan (int hours, int minutes, int seconds){ //это переданный интервал?
        this.second = second;
        this.hour = hour;
        this.minute = minute;
    }

    /* Добавьте метод void add/subtract(TimeSpan time),
    который должен прибавлять/вычитать к текущему интервалу значение переданного интервала */
    public void add (TimeSpan time){
        second += this.second;
        hour += this.hour;
        minute += this.minute;
    }

    public void subtract (TimeSpan time){
        second -= this.second;
        hour -= this.hour;
        minute -= this.minute;
    }

    /* Добавьте метод public String toString(),
    который должен возвращать строковое представление интервала в любом удобном виде */
    public String toString() {
        return String.format("(%d,%d)", second, hour, minute);
    }

    public static void main(String[] args) {

    }
}
