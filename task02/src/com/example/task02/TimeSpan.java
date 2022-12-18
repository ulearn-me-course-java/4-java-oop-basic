package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minites;
    private int seconds;

    public TimeSpan(int hours, int minites, int seconds) {
        this.seconds = seconds % 60;
        this.minites = seconds / 60 + minites % 60;
        this.hours = minites / 60 + hours;
    }

    public void add(TimeSpan time) {
        minites += (time.seconds + seconds) / 60;
        seconds = (time.seconds + seconds) % 60;
        hours += (time.minites + minites) / 60;
        minites = (time.minites + minites) % 60;
        hours = (time.hours + hours);
    }

    void subtract(TimeSpan time) {
        if (time.seconds > seconds) {
            minites--;
            seconds = 60 - (time.seconds - seconds);
        } else seconds -= time.seconds;
        if (time.minites > minites) {
            hours--;
            minites = 60 - (time.minites - minites);
        } else minites -= time.minites;
        if (time.hours > hours) hours = 24 - (time.hours - hours);
        else hours -= time.hours;
    }

    public String toString() {
        return hours + " часов, " + minites + " минут, " + seconds + " секунд.";
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinites() {
        return minites;
    }

    public void setMinites(int minites) {
        this.minites = minites;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
