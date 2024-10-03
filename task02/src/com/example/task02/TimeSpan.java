package com.example.task02;

public class TimeSpan
{
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds)
    {
        setHour(hours);
        setMinute(minutes);
        setSecond(seconds);
        normalize();
    }

    public int getHour() { return hours; }

    public void setHour(int hours) { this.hours = hours; }

    public int getMinute() { return minutes; }

    public void setMinute(int minutes) { this.minutes = minutes; }

    public int getSecond() { return seconds; }

    public void setSecond(int seconds) { this.seconds = seconds ;}

    private void normalize() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }


    public void add(TimeSpan time)
    {
        this.hours += time.getHour();
        this.minutes += time.getMinute();
        this.seconds += time.getSecond();
        normalize();
    }

    public void subtract(TimeSpan time)
    {
        this.hours -= time.getHour();
        this.minutes -= time.getMinute();
        this.seconds -= time.getSecond();
        normalize();
    }

    public String toString()
    {
        return hours + ":" + minutes + ":" + seconds;
    }
}
