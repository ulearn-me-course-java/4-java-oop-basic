package com.example.task02;

public class TimeSpan {
    private int hour, min, sec;
    private int tempHour, tempMin, tempSec;

    public TimeSpan(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        tempHour = hour;
        tempMin = min;
        tempSec = sec;
    }

    public void setHour(int hour) {
        if (hour < 24 && hour >= 0) {
            this.hour = hour;
            tempHour = hour;
        } else throw new IllegalArgumentException("неверный аргумент при вызове метода setHour");
    }

    public void setMin(int min) {
        if (min < 60 && min >= 0) {
            this.min = min;
            tempMin = min;
        } else throw new IllegalArgumentException("неверный аргумент при вызове метода setMin");
    }

    public void setSec(int sec) {
        if (sec < 60 && sec >= 0) {
            this.sec = sec;
            tempSec = sec;
        } else throw new IllegalArgumentException("неверный аргумент при вызове метода setSec");
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    void add(TimeSpan time) {
        tempHour += time.hour;
        tempMin += time.min;
        tempSec += time.sec;
        if ((tempHour > 23 || tempHour < 0) || (tempMin > 59 || tempMin < 0)
                || (tempSec > 59 || tempSec < 0)) {
            throw new IllegalArgumentException("неверное(ые) значение(ия)");
        } else {
            hour = tempHour;
            min = tempMin;
            sec = tempSec;
        }
    }

    void subtract(TimeSpan time) {
        tempHour -= time.hour;
        tempMin -= time.min;
        tempSec -= time.sec;
        if ((tempHour > 23 || tempHour < 0) || (tempMin > 59 || tempMin < 0)
                || (tempSec > 59 || tempSec < 0)) {
            throw new IllegalArgumentException("неверное(ые) значение(ия)");
        } else {
            hour = tempHour;
            min = tempMin;
            sec = tempSec;
        }
    }

    public String toString() {
        return String.format("%d:%d:%d", hour, min, sec);
    }
}