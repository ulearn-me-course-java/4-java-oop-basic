package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        if (this.minutes >= 60) {
            this.hours++;
            this.minutes -= 60;
        }
        this.seconds += time.seconds;
        if (this.seconds >= 60) {
            this.minutes++;
            this.seconds -= 60;
        }
        if (this.minutes >= 60) {
            this.hours++;
            this.minutes -= 60;
        }
    }

    void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        if (this.minutes < 0) {
            this.hours--;
            this.minutes += 60;
        }
        this.seconds -= time.seconds;
        if (this.seconds < 0) {
            this.minutes--;
            this.seconds += 60;
        }

        if (this.minutes < 0) {
            this.hours--;
            this.minutes += 60;
        }

    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }

}
