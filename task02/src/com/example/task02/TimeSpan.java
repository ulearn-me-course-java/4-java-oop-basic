package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        normalizeData();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    private void normalizeData(){
        if(this.second > 60){
            this.minute += this.second / 60;  // Если секунды больше 60, добавляем минуты
            this.second %= 60; // Устанавливаем остаток секунд
        }
        if (this.minute > 60) {
            this.hour += this.minute / 60; // Если минуты больше 60, добавляем часы
            this.minute %= 60; // Устанавливаем остаток минут
        }
        if (this.minute < 0){
            this.hour -= (minute / 60) + 1; // Если минуты отрицательны, вычитаем часы и 1
            this.minute = 60 + this.minute; // Устанавливаем корректные минуты
        }
    }

    public void add(TimeSpan time){
        this.hour += time.getHour();
        this.minute += time.getMinute();
        this.second += time.getSecond();

        normalizeData();
    }

    public void subtract(TimeSpan time){
        this.hour -= time.getHour();
        this.minute -= time.getMinute();
        this.second -= time.getSecond();

        normalizeData();
    }

    public String toString() {
        return String.format("%s hours, %s minutes, %s seconds", this.hour, this.minute, this.second);
    }
}