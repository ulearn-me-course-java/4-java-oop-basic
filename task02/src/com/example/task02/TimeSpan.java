package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public  TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    void add(TimeSpan time)
    {
        setHours(hours + time.hours);
        setMinutes(minutes + time.minutes);
        setSeconds(seconds + time.seconds);
    }

    void subtract(TimeSpan time)
    {
        setHours(Math.abs(hours - time.hours));
        setMinutes(Math.abs(minutes - time.minutes));
        setSeconds(Math.abs(seconds - time.seconds));
    }

    public String toString()
    {
        return String.format("%d h %d min %d s", hours, minutes, seconds);
    }

    public int getHours() { return hours; }
    public void setHours(int hours) { this.hours = hours; }

    public int getMinutes() { return minutes; }
    public void setMinutes(int minutes) { this.minutes = minutes % 60; hours += minutes / 60; }

    public int getSeconds() { return seconds; }
    public void setSeconds(int seconds) { this.seconds = seconds % 60; setMinutes(minutes + seconds / 60); }
}
