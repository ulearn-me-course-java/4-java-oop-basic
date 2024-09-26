package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;


    public int GetHours() {
        return hours;
    }

    public int GetMinutes() {
        return minutes;
    }

    public int GetSeconds() {
        return seconds;
    }

    public int SetHours(int value) {
        return hours = value;
    }

    public int SetMinutes(int value) {
        return minutes = value;
    }

    public int SetSeconds(int value) {
        return seconds = value;
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        if (hours < 0 || seconds < 0 || minutes < 0) {
            System.out.println("Invalid Input");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        NormalizeTime();
    }

    public void NormalizeTime() {
        if (seconds >= 60) {
            seconds /= 60;
            minutes %= 60;
        }
        if (minutes >= 60) {
            minutes /= 60;
            hours %= 60;
        }
    }

    public void add (TimeSpan time)
    {
        this.hours = this.hours + time.GetHours();
        this.minutes = this.minutes + time.GetMinutes();
        this.seconds = this.seconds + time.GetSeconds();
    }

    public void subtract(TimeSpan time)
    {
        this.hours = this.hours - time.GetHours();
        this.minutes = this.minutes - time.GetMinutes();
        this.seconds = this.seconds - time.GetSeconds();
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}