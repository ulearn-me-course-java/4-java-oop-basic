package com.example.task02;

import java.util.concurrent.TimeUnit;

public class TimeSpan {

    private int Hours;
    private int Minutes;
    private int Seconds;

    public TimeSpan(int hours, int minutes, int seconds)
    {
        this.Hours = hours;

        this.Minutes = minutes % 60;
        this.Hours += minutes / 60;

        this.Seconds = seconds % 60;
        this.Hours += seconds / 3600;
        this.Minutes += seconds / 60;
    }

    public int getHours()
    {
        return Hours;
    }

    public void setHours(int hours)
    {
        this.Hours = hours;
    }

    public int getMinutes()
    {
        return Minutes;
    }

    public void setMinutes(int minutes)
    {
        this.Minutes = minutes;
    }

    public int getSeconds()
    {
        return Seconds;
    }

    public void setSeconds(int seconds)
    {
        this.Seconds = seconds;
    }

    void add(TimeSpan time)
    {
        this.Hours += time.Hours + (this.Minutes + time.Minutes)/60 + (this.Seconds + time.Seconds)/3600;

        this.Minutes = (this.Minutes + time.Minutes % 60 + (this.Seconds + time.Seconds)/60) % 60;

        this.Seconds = (this.Seconds + time.Seconds) % 60;

    }

    void subtract(TimeSpan time)
    {
        long timeSum = this.Hours * 3600 + this.Minutes * 60 + this.Seconds;

        long timeDiff = time.Hours * 3600 + time.Minutes * 60 + time.Seconds;

        timeSum += timeDiff;

        long h = timeSum / 3600;
        this.Hours = (int)h;

        long m = (timeSum / 60) % 60;
        this.Minutes = (int)m;

        long s = timeSum % 60;
        this.Seconds = (int)s;

    }

    public String toString()
    {
        String timeToString = String.format("%d:%d:%d", this.Hours, this.Minutes, this.Seconds);

        return timeToString;
    }
}
