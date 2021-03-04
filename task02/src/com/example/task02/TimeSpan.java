package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    //region Set and Get
    public int getHour() {
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    //endregion

    public TimeSpan(int hour,int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    void add(TimeSpan time){
        second+=time.getSecond();
        if(second>60) {
            second=second%60;
            minute++;
        }
        minute+=time.getMinute();
        if(minute>60) {
            minute=minute%60;
            hour++;
        }
        hour+=time.getHour();
        if(hour>24) {
            hour=hour%24;
        }
    }

    void subtract(TimeSpan time){
        second-=time.getSecond();
        if(second<0) {
            second=60+second;
            minute--;
        }
        minute-=time.getMinute();
        if(minute<0) {
            minute=60+minute;
            hour--;
        }
        hour-=time.getHour();
        if(hour>0) {
            hour=hour+24;
        }
    }
    public String toString(){
        return String.format("HH:MM:SS %d:%d:%d", hour, minute,second);
    }

}