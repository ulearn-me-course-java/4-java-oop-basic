package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minutes;
    private int seconds;

    public TimeSpan(int hour, int seconds, int minutes) {
        setHour(hour);
        setSeconds(seconds);
        setMinutes(minutes);
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        if (minutes > 60) {
            this.hour++;
            this.minutes = minutes - 60;
        } else this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds > 60) {
            this.minutes++;
            this.seconds = seconds - 60;
        } else this.seconds = seconds;
    }

    void add(TimeSpan time) {
        hour += time.getHour();
        if ((minutes + time.getMinutes()) > 60) {
            hour++;
            minutes = Math.abs(60 - (minutes + time.getMinutes()));
        } else minutes += time.getMinutes();
        if ((seconds + time.getSeconds()) > 60) {
            minutes++;
            seconds = Math.abs(60 - (seconds + time.getSeconds()));
        } else seconds += time.getSeconds();
    }

    void subtract(TimeSpan time) {
        hour -= time.getHour();
        if ((minutes - time.getMinutes()) < 0) {
            hour--;
            minutes = 60 - Math.abs((minutes - time.getMinutes()));
        } else minutes -= time.getMinutes();
        if ((seconds - time.getSeconds()) < 0) {
            minutes--;
            seconds = 60 - Math.abs((seconds - time.getSeconds()));
        } else seconds -= time.getSeconds();
    }

    public String toString() {
        return "[ " + hour + ":" + minutes + ":" + seconds + " ]";
    }
}
