package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(){
    }
    public TimeSpan(int hour, int minute, int second){
        int time =  hour * 3600 + minute * 60 + second;
        setSecond(time);
    }

    public int getHour(){
        return hours;
    }

    public void setHour(int hour){
        this.hours = hour;
    }

    public int getMinute(){
        return minutes;
    }

    public void setMinute(int minute){
        if(minute > 59){
            hours = minute/60;
            this.minutes = minute - hours * 60;
        } else if (minute >= 0){
            this.minutes = minute;
        } else {
            throw new IllegalArgumentException("minute must be in range 0-59 but found "+ minute);
        }
    }

    public int getSecond(){
        return seconds;
    }

    public void setSecond(int second){
        if(second >= 60){
            setMinute(second/60);
            this.seconds = second - hours *3600 - minutes *60;
        } else if (second >= 0){
            this.seconds = second;
        } else{
            throw new IllegalArgumentException("second must be in range 0-59 but found "+ second);
        }
    }

    void add(TimeSpan time){
        int time1 = hours * 3600 + minutes * 60 + seconds;
        int time2 = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int sum = time1 + time2;
        this.setSecond(sum);
    }

    void subtract(TimeSpan time){
        int time1 = hours * 3600 + minutes * 60 + seconds;
        int time2 = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int sub = time1 - time2;
        this.setSecond(sub);
    }

    public String toString(){
        return "time: " + hours + ":" + minutes + ":" + seconds;
    }
}
