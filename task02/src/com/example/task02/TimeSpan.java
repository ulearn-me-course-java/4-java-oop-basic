package com.example.task02;

public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void add(TimeSpan time) {
        hours += time.getHours();
        minutes += time.getMinutes();
        seconds += time.getSeconds();
        if (seconds >= 60) {
            minutes += 1;
            seconds -= 60;
        }
        if (minutes >= 60) {
            hours++;
            minutes -= 60;
        }
    }

    public void subtract(TimeSpan time) {
        hours -= time.getHours();
        minutes -= time.getMinutes();
        seconds -= time.getSeconds();
    }

    public String toString() {

        return correctString(getHours()) + ":" + correctString(getMinutes()) + ":"
                + correctString(getSeconds()) + " hours:minutes:seconds";
    }

    public String correctString(int value) {
        StringBuilder sb = new StringBuilder();
        if (Integer.toString(value).length() == 1) {
            sb.append("0");
            sb.append(value);
        } else {
            sb.append(value);
        }
        return sb.toString();
    }
}
