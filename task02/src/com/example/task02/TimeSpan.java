package com.example.task02;

public class TimeSpan {
    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return this.hour;
    }
    public void setHour(int hour) {
        if (hour >= 0) {
            this.hour = hour;
        }
    }

    public int getMin() {
        return this.min;
    }
    public void setMin(int min) {
        if (min >= 0) {
            this.hour += min / 60;
            this.min = min % 60;
        }
    }

    public int getSec() {
        return this.sec;
    }
    public void setSec(int sec) {
        if (sec >= 0) {
            this.hour += (sec / 3600) + ((this.min + (sec % 3600) / 60) / 60);
            this.min = (this.min + (sec % 3600) / 60) % 60;
            this.sec = sec % 60;
        }
    }

    public TimeSpan(int hour, int min, int sec) {
        if (hour >= 0 && min >= 0 && sec >= 0) {
            setHour(hour);
            setMin(min);
            setSec(sec);
        }

    }

    void add(TimeSpan time) {
        setHour(hour + time.hour);
        setMin(min + time.min);
        setSec(sec + time.sec);
    }

    void subtract(TimeSpan time) {
        int allTimeInSec = (sec + min * 60 + hour * 3600) - (time.sec + time.min * 60 + time.hour * 3600);
        setHour(0);
        setMin(0);
        setSec(Math.max(0, allTimeInSec));
    }

    public String toString() {
        return String.format("%d:%d:%d", hour, min, sec);
    }
}
