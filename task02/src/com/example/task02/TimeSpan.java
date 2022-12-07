package com.example.task02;
/*
Создайте класс TimeSpan, который будет хранить временной интервал в часах, минутах и секундах (каждый в отдельном поле).
Все поля должны быть объявлены как `private`, т.е. скрыты от прямого доступа снаружи. Для каждого поля добавить пару `public` методов,
один из которых будет получать (get) значение поля, другой - выставлять (set).
Для класса нужно описать конструктор, который принимает на вход три параметра и инициализирует свое состояние по ним.

Класс должен корректно работать со временем. Например при получении 100 минут должен преобразовывать их в 1 час 40 минут.

Добавьте метод `void add(TimeSpan time)`, который должен прибавлять к текущему интервалу значение переданного интервала

Добавьте метод `void subtract(TimeSpan time)`, который должен вычитать из текущего интервала значение переданного интервала

Добавьте метод `public String toString()`, который должен возвращать строковое представление интервала в любом удобном виде
 */

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;
    public TimeSpan() {

    }
    public TimeSpan(int hours, int minutes, int seconds) {
        this.Seconds = seconds%60;
        this.Minutes = (minutes + seconds/60)%60;
        this.Hours = hours + (minutes + seconds/60)/60;
    }
    public void getHours(int hours) {
        this.Hours = hours;
    }
    public int setHours() {
        return this.Hours;
    }
    public void getMinutes(int minutes) {
        this.Minutes = minutes%60;
        this.Hours = this.Hours + minutes/60;
    }
    public int setMinutes() {
        return this.Minutes;
    }
    public void getSeconds(int seconds) {
        this.Seconds = seconds%60;
        this.Minutes = (this.Minutes + seconds/60)%60;
        this.Hours = this.Hours + (this.Minutes + seconds/60)/60;
    }
    public int setSeconds() {
        return this.Seconds;
    }
    public void add(TimeSpan time) {
        int seconds = this.Seconds + time.Seconds;
        int minutes = this.Minutes + time.Minutes;
        int hours = this.Hours + time.Hours;
        this.Seconds = seconds%60;
        this.Minutes = (minutes + seconds/60)%60;
        this.Hours = hours + (minutes + seconds/60)/60;
    }
    public void subtract(TimeSpan time) {
        int seconds =   (this.Seconds + this.Minutes*60 + this.Hours*3600) -
                        (time.Seconds + time.Minutes*60 +time.Hours*3600);
        this.Seconds = seconds%60;
        this.Minutes = seconds/60%60;
        this.Hours = seconds/3600;
    }
    public String toString() {
        return (String.format("%d:%d:%d", this.Hours, this.Minutes, this.Seconds));
    }
}
