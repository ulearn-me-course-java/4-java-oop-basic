package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int h) {
        this.hours = h;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int m) {
        this.hours += m / 60;
        this.minutes = m % 60;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int s) {
        this.minutes += s / 60;
        this.seconds = s % 60;
    }

    public TimeSpan(int h, int m, int s) {
        setHours(h);
        setMinutes(m);
        setSeconds(s);
    }

    void add(TimeSpan timeSpan) {
        setHours(this.hours + timeSpan.hours);
        setMinutes(this.minutes + timeSpan.minutes);
        setSeconds(this.seconds + timeSpan.seconds);
    }

    void subtract(TimeSpan timeSpan) {
        int occupyM = 0;
        int occupyH = 0;

        if (this.seconds >= timeSpan.seconds) {
            setSeconds(Math.abs(this.seconds - timeSpan.seconds));
        } else {
            occupyM = 1;
            setSeconds(60 - Math.abs(this.seconds - timeSpan.seconds));
        }

        if (this.minutes >= timeSpan.minutes) {
            setMinutes(Math.abs(this.minutes - timeSpan.minutes) - occupyM);
        } else {
            setMinutes(60 - Math.abs(this.minutes - timeSpan.minutes) - occupyM);
            occupyH = 1;
        }

        setHours(Math.abs(this.hours - timeSpan.hours) - occupyH);
    }

    public String toString() {
        return String.format("hours: %d, minutes: %d, seconds: %d", getHours(), getMinutes(), getSeconds());
    }
}
