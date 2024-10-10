package com.example.task02;

public class TimeSpan
{
    private int Hour;
    private int Minute;
    private int Second;

    public void setMinute(int minute)
    {
        Minute = minute;
    }

    public int getMinute()
    {
        return Minute;
    }

    public void setHour(int hour)
    {
        Hour = hour;
    }

    public int getHour()
    {
        return Hour;
    }

    public void setSecond(int second)
    {
        Second = second;
    }

    public int getSecond()
    {
        return Second;
    }

    private void parseToCorrectFormat(int hour, int minute, int second)
    {
        if (second > 59)
        {
            minute = minute + (second / 60);
            second = second % 60;
        }
        if (minute > 59)
        {
            hour = hour + (minute / 60);
            minute = minute % 60;
        }
        Hour = hour;
        Minute = minute;
        Second = second;
    }

    public TimeSpan(int hour, int minute, int second)
    {
        parseToCorrectFormat(hour, minute, second);
    }

    public void add(TimeSpan time)
    {
        Hour += time.Hour;
        Minute += time.Minute;
        Second += time.Second;
        parseToCorrectFormat(Hour, Minute, Second);
    }

    public void subtract(TimeSpan time)
    {
        Hour -= time.Hour;
        Minute -= time.Minute;
        Second -= time.Second;
        parseToCorrectFormat(Hour, Minute, Second);
    }

    public String toString()
    {
        return String.format("%dh,%dm,%ds", Hour, Minute, Second);
    }
}