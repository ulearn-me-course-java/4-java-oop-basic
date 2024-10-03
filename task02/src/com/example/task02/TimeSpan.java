package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        FormatTime();
    }

    void FormatTime() {
        int fullTime = hour * 3600 + minute * 60 + second;
        this.hour = fullTime / 3600;
        this.minute = (fullTime - this.hour * 3600) / 60;
        this.second = fullTime - ((fullTime - this.hour * 3600) - this.minute * 60);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        FormatTime();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        FormatTime();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        FormatTime();
    }

    void add(TimeSpan time) {
        this.hour+=time.hour;
        this.minute+= time.minute;
        this.second+= time.second;
        FormatTime();
    }

    void subtract(TimeSpan time){
        this.hour-=time.hour;
        this.minute-= time.minute;
        this.second-= time.second;
        FormatTime();
    }

    public String toString(){
        String strHour = String.valueOf(hour);
        String strMinute = String.valueOf(minute);
        String strSecond = String.valueOf(second);
        return strHour+":"+strMinute+":"+strSecond;
    }
}
