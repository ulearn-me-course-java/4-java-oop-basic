package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    void add(TimeSpan time) {
        if (this.seconds + time.seconds >= 60) {
            this.minutes += (this.seconds + time.seconds) / 60;
            this.seconds = (this.seconds + time.seconds) - (this.seconds + time.seconds) / 60 * 60;
        }
        else
            this.seconds = this.seconds + time.seconds;

        if (this.minutes + time.minutes >= 60) {
            this.hours   += (this.minutes + time.minutes) / 60;
            this.minutes = (this.minutes + time.minutes) - (this.minutes + time.minutes) / 60 * 60;
        }
        else
            this.minutes = this.minutes + time.minutes;

        this.hours  = this.hours  + time.hours;
    }

    void subtract(TimeSpan time) throws IllegalArgumentException {
        if (this.seconds - time.seconds < 0) {
            this.minutes += Math.floor((double) (this.seconds - time.seconds) / 60);
            this.seconds = (this.seconds - time.seconds) - (int)Math.floor((double) (this.seconds - time.seconds) / 60) * 60;
        }
        else
            this.seconds = this.seconds - time.seconds;

        if (this.minutes - time.minutes < 0) {
            this.hours += Math.floor((double) (this.minutes - time.minutes) / 60);
            this.minutes = (this.minutes - time.minutes) - (int)Math.floor((double) (this.minutes - time.minutes) / 60) * 60;
        }
        else
            this.minutes = this.minutes - time.minutes;

        if (this.hours - time.hours < 0) {
            throw new IllegalArgumentException();
        }
        else
            this.hours  = this.hours - time.hours;
    }

    public String toString() {
        return "Hours " + this.hours + " Minutes " + this.minutes + " Seconds " + this.seconds;
    }
}
