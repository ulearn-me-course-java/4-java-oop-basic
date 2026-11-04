
package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    // Конструктор
    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    // Getters
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Setters
    public void setHours(int hours) {
        this.hours = hours;
        normalize();
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        normalize();
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        normalize();
    }

    // Нормализация времени
    private void normalize() {
        minutes += seconds / 60;
        seconds %= 60;

        hours += minutes / 60;
        minutes %= 60;
    }

    // Сложение интервалов
    public void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        normalize();
    }

    // Вычитание интервалов
    public void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;

        normalize();
    }

    // Строковое представление
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
