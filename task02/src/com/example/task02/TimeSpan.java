package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        setMinute(minute);
        setSecond(second);
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
        if (minute < 0 || minute > 59) {
            this.hour += minute/60;
            this.minute = minute%60;
        }

        else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 59) {
            setMinute(second/60 + this.minute);
            this.second = second%60;
        }

        else {
            this.second = second;
        }
    }

    public void add(TimeSpan time){
        setSecond(time.getSecond() + this.second);
        setMinute(time.getMinute() + this.minute);
        this.hour += time.getHour();
    }

    void subtract(TimeSpan time){
        setSecond(this.second - time.getSecond());
        setMinute(this.minute - time.getMinute());
        this.hour -= time.getHour();
    }

    public String toString(){
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }
}
