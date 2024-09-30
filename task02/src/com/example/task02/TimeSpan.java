package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        convert();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = Math.max(0, hours);
        convert();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = Math.max(0, minutes);
        convert();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = Math.max(0, seconds);
        convert();
    }

    public void convert() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }

    public void add(TimeSpan time) {
        this.hours += time.getHours();
        this.minutes += time.getMinutes();
        this.seconds += time.getSeconds();
        convert();
    }

    public void subtract(TimeSpan time) {
        this.hours -= time.getHours();
        this.minutes -= time.getMinutes();
        this.seconds -= time.getSeconds();

        if (this.seconds < 0) {
            this.seconds += 60;
            this.minutes -= 1;
        }
        if (this.minutes < 0) {
            this.minutes += 60;
            this.hours -= 1;
        }
        if (this.hours < 0) {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

