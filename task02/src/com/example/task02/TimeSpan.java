package com.example.task02;

public class TimeSpan
{
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void add(TimeSpan timeSpan)
    {
        setHours(hours + timeSpan.hours);
        setMinutes(minutes + timeSpan.minutes);
        setSeconds(seconds + timeSpan.seconds);
    }

    public void subtract(TimeSpan timeSpan)
    {
        setHours(hours - timeSpan.hours);
        setMinutes(minutes - timeSpan.minutes);
        setSeconds(seconds - timeSpan.seconds);
    }

    public void setHours(int h)
    {
        if (h > 0)
            hours = h;
    }

    public void setMinutes(int m)
    {
        if (m > 60)
        {
            minutes = m % 60;
            hours = m / 60;
        }
        else if (m > 0)
            minutes = m;
    }

    public void setSeconds(int s)
    {
        if (s > 60)
        {
            seconds = s % 60;
            setMinutes(minutes + s / 60);
        }
        else if (s > 0)
            seconds = s;
    }

    public int getHours()
    {
        return hours;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public String toString()
    {
        return String.format("h:%d, m:%d, s:%d", hours, minutes, seconds);
    }
}
