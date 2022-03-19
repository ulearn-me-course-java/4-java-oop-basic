package com.example.task02;

public class TimeSpan
{
    public TimeSpan(int hour, int min, int sec)
    {
        correctTimeFormat(hour, min, sec);
    }

    private int hour;
    private int min;
    private int sec;

    private void correctTimeFormat(int hour, int min, int sec)
    {
        if (sec > 59)
        {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min > 59)
        {
            hour += min / 60;
            min = min % 60;
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    void add(TimeSpan time) // должен прибавлять к текущему интервалу значение переданного интервала
    {
        correctTimeFormat(hour + time.hour, min + time.min, sec + time.sec);
    }

    void subtract(TimeSpan time) // должен вычитать из текущего интервала значение переданного интервала
    {
        int newTimeInSec = ((time.hour * 60) + time.min) * 60 + time.sec;
        int oldTimeInSec = ((hour * 60) + min) * 60 + sec;

        int sub = newTimeInSec - oldTimeInSec;
        sec = sub % 60;
        min = (sub / 60) % 60;
        hour = (sub / 60) / 60;

        correctTimeFormat(hour, min, sec);
    }

    public String toString() // должен возвращать строковое представление интервала в любом удобном виде
    {
        return String.format("%d:%d:%d", hour, min, sec); //hour + ":" + min + ":" + sec;
    }
}

