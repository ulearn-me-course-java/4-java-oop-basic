package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

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
        if (hours < 0) {
            throw new IllegalArgumentException("Hours is out of range");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Minutes is out of range");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("Seconds is out of range");
        }
        this.seconds = seconds;
    }

    TimeSpan() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    TimeSpan(int hours, int minutes, int seconds) {
        setSeconds(seconds);
        setMinutes(minutes);
        setHours(hours);
    }

    void add(TimeSpan time) {
        seconds += time.getSeconds();
        minutes += time.getMinutes();
        hours += time.getHours();

        if (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }

        if (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
    }

    void subtract(TimeSpan time) {
        if (time == null) {
            throw new IllegalArgumentException();
        }
        if ((hours < time.hours) || (hours == time.hours && minutes < time.minutes) || (hours == time.hours && minutes == time.minutes && seconds < time.seconds)) {
            System.out.println("Временной интервал не может быть отрицательным");
        } else {
            seconds -= time.seconds;
            while (seconds < 0) {
                seconds += 60;
                minutes -= 1;
            }
            minutes -= time.minutes;
            while (minutes < 0) {
                minutes += 60;
                hours -= 1;
            }
            hours -= time.hours;
        }
    }

    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
