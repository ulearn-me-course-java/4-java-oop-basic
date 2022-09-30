package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public TimeSpan(int hour, int minute, int second) {

        while (second > 59) {
            minute++;
            second -= 60;
        }

        while (minute > 59) {
            hour++;
            minute -= 60;
        }

        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void add(TimeSpan time) {
        int hour = getHour();
        int minute = getMinute();
        int second = getSecond();

        hour += time.getHour();
        minute += time.getMinute();
        second += time.getSecond();

        while (second > 59) {
            minute++;
            second -= 60;
        }

        while (minute > 59) {
            hour++;
            minute -= 60;
        }

        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void subtract(TimeSpan time) {
        int hour = getHour();
        int minute = getMinute();
        int second = getSecond();

        hour -= time.getHour();
        minute -= time.getMinute();
        second -= time.getSecond();

        while (second > 59) {
            minute++;
            second -= 60;
        }

        while (minute > 59) {
            hour++;
            minute -= 60;
        }

        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString() {
        String time = new String();
        time = String.format("%d:%d:%d", hour, minute, second);
        return time;
    }
}
