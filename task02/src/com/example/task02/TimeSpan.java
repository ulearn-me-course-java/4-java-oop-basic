package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    TimeSpan(int seconds, int minutes, int hours) {
        setTime(seconds, minutes, hours);
    }

    public void setTime(int seconds, int minutes, int hours) {
        this.seconds = seconds % 60;
        this.minutes = (minutes + seconds / 60) % 60;
        this.hours = (hours + minutes / 60 + seconds / 3600) % 24;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void add(TimeSpan time) {
        int totalSeconds = seconds + time.getSeconds();
        int totalMinutes = minutes + time.getMinutes()+totalSeconds/60;
        int totalHours = hours + time.getHours()+totalMinutes/60;

        this.seconds = totalSeconds%60;
        this.minutes = totalMinutes%60;
        this.hours = totalHours;
    }

    void subtract(TimeSpan time)
    {
        int totalSeconds = seconds - time.getSeconds();
        int totalMinutes = minutes - time.getMinutes();
        int totalHours = hours - time.getHours();

        if (totalSeconds<0)
        {
            totalSeconds+=60;
            totalMinutes--;
        }

        if (totalMinutes<0)
        {
            totalMinutes+=60;
            totalHours--;
        }
        this.seconds = totalSeconds;
        this.minutes = totalMinutes;
        this.hours = totalHours;
    }

    public String toString()
    {
        return String.format("%d seconds, %d minutes, %d hours", seconds, minutes,hours);
    }
}
