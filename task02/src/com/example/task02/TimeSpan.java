package com.example.task02;

import java.sql.Time;
import java.util.MissingFormatArgumentException;

public class TimeSpan
{
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public int getSeconds() { return seconds; }
    public int getMinutes() { return minutes; }
    public int getHours() { return hours; }
    public void setSeconds(int s)
    {
        int m = 0;
        while (s > 60)
        {
            m += 1;
            s -= 60;
        }
        minutes += m;
        seconds = s;
    }

    public void setMinutes(int m)
    {
        int h = 0;
        while (m > 60)
        {
            h += 1;
            m -= 60;
        }
        hours += h;
        minutes += m;
    }



    public void setHours(int h)
    {
        hours += h;
    }

    public TimeSpan(int h, int m, int s)
    {
        setSeconds(s);
        setMinutes(m);
        setHours(h);
    }
    void add(TimeSpan time)
    {
        setSeconds(seconds + time.seconds);
        setMinutes(time.minutes);
        setHours(time.hours);
    }
    void subtract(TimeSpan time)
    {
        while (time.seconds > seconds)
        {
            seconds += 60;
            minutes -= 1;
        }
        while (time.minutes > minutes)
        {
            minutes += 60;
            hours -= 1;
        }
        if (hours < time.hours)
        {
            throw new IllegalArgumentException("Incorrect");
        }
        setSeconds(seconds - time.seconds);
        setMinutes(-time.minutes);
        setHours(-time.hours);
    }
    public String toString()
    {
        return hours + " часов, " + minutes + " минут, " + seconds + " секунд.";
    }
}
