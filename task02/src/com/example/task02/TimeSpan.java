package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    private int totalSecond;
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public TimeSpan(int hour, int minute, int second) {
       totalSecond = hour*60*60 + minute*60 + second;
       formatTimeSpan();
    }
    private void formatTimeSpan() {

        this.hour = totalSecond/3600;
        this.minute = (totalSecond%3600)/60;
        this.second = (totalSecond%3600)%60;
    }
    void add(TimeSpan time) {
        totalSecond += time.getHour()*60 + time.getMinute()*60 + time.getSecond();
        formatTimeSpan();
    }
    void subtract(TimeSpan time){
        totalSecond -= time.getHour()*60 + time.getMinute()*60 + time.getSecond();
        formatTimeSpan();
    }
    public String toString(){

        String s = String.format("%s:%s:%s",hour,minute,second);
        return s;
    }



}

