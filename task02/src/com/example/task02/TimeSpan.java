package com.example.task02;

public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;


    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        normalizeTime(); // Нормализуем время
    }


    public int getHours() {
        return hours;
    }


    public void setHours(int hours) {
        this.hours = hours;
    }


    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        normalizeTime(); // Нормализуем время
    }


    public int getSeconds() {
        return seconds;
    }


    public void setSeconds(int seconds) {
        this.seconds = seconds;
        normalizeTime(); // Нормализуем время
    }

    // Метод для нормализации времени
    private void normalizeTime() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
//        if (seconds < 0) {
//            minutes -= (Math.abs(seconds) / 60) + 1;
//            seconds = 60 - Math.abs(seconds) % 60;
//        }
//        if (minutes < 0) {
//            hours -= (Math.abs(minutes) / 60) + 1;
//            minutes = 60 - Math.abs(minutes) % 60;
//        }
    }


    public void add(TimeSpan time) {
        this.hours += time.getHours();
        this.minutes += time.getMinutes();
        this.seconds += time.getSeconds();
        normalizeTime(); // Нормализуем время после сложения
    }


    public void subtract(TimeSpan time) {
        this.hours -= time.getHours();
        this.minutes -= time.getMinutes();
        this.seconds -= time.getSeconds();
        normalizeTime();
    }



    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

