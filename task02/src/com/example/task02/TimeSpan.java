package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours,int minutes,int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeSpan()
    {
        this.seconds = 0; this.minutes = 0; this.hours = 0;
    }

    public void add(TimeSpan time)
    {
        this.seconds += time.seconds;
        this.minutes += time.minutes;
        this.hours += time.hours;
    }

    public void subtract(TimeSpan time)
    {
        this.seconds -= time.seconds;
        this.minutes -= time.minutes;
        this.hours -= time.hours;
    }

    public String toString()
    {
        return "Interval :" + Integer.toString(seconds) + " seconds, " + Integer.toString(minutes)
                + " minutes, and " + Integer.toString(hours) + " hours";
    }

    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }

    public void setMinutes(int seconds)
    {
        this.minutes = minutes;
    }

    public void setHours(int seconds)
    {
        this.hours = hours;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public int getHours()
    {
        return hours;
    }
}
