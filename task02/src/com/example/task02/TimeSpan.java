package com.example.task02;


public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;

        if (minutes >= 60) {
            this.hours += minutes / 60;
            this.minutes = minutes % 60;
        } else {
            this.minutes = minutes;
        }

        if (seconds >= 60) {
            this.minutes += seconds / 60;
            this.seconds = seconds % 60;
        } else {
            this.seconds = seconds;
        }
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public void setMinutes(int minutes) {
        if (minutes >= 60) {
            hours += minutes / 60;
            this.minutes = minutes % 60;
        } else {
            this.minutes = minutes;
        }
    }


    public void setSeconds(int seconds) {
        if (seconds >= 60) {
            minutes += seconds / 60;
            this.seconds = seconds % 60;
        } else {
            this.seconds = seconds;
        }
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

    void add(TimeSpan time) {
        hours += time.getHours();
        minutes += time.getMinutes();
        seconds += time.getSeconds();
    }

    void subtract(TimeSpan time) {
        hours -= time.getHours();
        minutes -= time.getMinutes();
        seconds -= time.getSeconds();
    }

    public String toString() {
        return (" Часов:" + hours + " Минут:" + minutes + " Секунд:" + seconds);
    }
}
