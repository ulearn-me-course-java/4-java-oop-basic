package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public TimeSpan() {
    }

    public void setHour(int h) {
        hours = h;
    }

    public int getHour() {
        return hours;
    }

    public void setMinute(int m) {
        if(m > 60) {
            hours = m / 60;
            minutes = m % 60;
        }
        else {
            minutes = m;
        }
    }

    public int getMinute() {
        return minutes;
    }

    public void setSecond(int s) {
        if(s > 60) {
            int middleHour = s / 3600;
            hours = middleHour;
            if(middleHour > 0)
                s -= 3600 * middleHour;
            minutes = s / 60;
            seconds = s % 60;
        }
        else {
            seconds = s;
        }
    }

    public int getSecond() {
        return seconds;
    }

    void add(TimeSpan time) {
        int number1 = hours * 3600 + minutes * 60 + seconds;
        int number2 = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int adding = number1 + number2;
        this.setSecond(adding);
    }

    void subtract(TimeSpan time) {
        int number1 = hours * 3600 + minutes * 60 + seconds;
        int number2 = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int adding = number1 - number2;
        this.setSecond(adding);
    }

    public String toString() {

        return hours + ":" + minutes + ":" + seconds;
    }
}
