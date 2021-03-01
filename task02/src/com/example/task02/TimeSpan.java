package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

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

    public void add(TimeSpan time) {
        second += time.getSecond();
        if (second >= 60) {
            minute += second / 60;
            second = second % 60;
        }
        minute += time.getMinute();
        if (minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
        }
        hour += time.getHour();
    }

    void subtract(TimeSpan time) {
        int mySeconds = hour * 3600 + minute * 60 + second;
        int subSeconds = time.getHour() * 3600 + time.getMinute() * 60 + time.getSecond();
        int resultSeconds = mySeconds - subSeconds;
        hour = resultSeconds / 3600;
        resultSeconds = resultSeconds % 3600;
        minute = resultSeconds / 60;
        second = resultSeconds % 60;
    }

    public String toString(){
        return String.format("(%d, %d, %d)", hour, minute, second);
    }
}

