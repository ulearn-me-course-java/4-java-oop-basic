package com.example.task02;

public class TimeSpan {
    private int timeSec;
    private int timeMin;
    private int timeHour;

    public TimeSpan(int timeSec, int timeMin, int timeHour){
        this.timeSec = timeSec;
        this.timeMin = timeMin;
        this.timeHour = timeHour;
        correctTime();
    }

    public int getTimeSec(){
        return timeSec;
    }

    public int getTimeMin(){
        return timeMin;
    }

    public int getTimeHour(){
        return timeHour;
    }

    public void setSeconds(int timeSec){
        this.timeSec = timeSec;
        correctTime();
    }

    public void setMins(int timeMin){
        this.timeMin = timeMin;
        correctTime();
    }

    public void setHours(int timeHour){
        this.timeHour = timeHour;
        correctTime();
    }

    void add(TimeSpan time){
        this.timeSec += time.timeSec;
        this.timeMin += time.timeMin;
        this.timeHour += time.timeHour;
        correctTime();
    }

    void subtract(TimeSpan time){
        this.timeSec -= time.timeSec;
        this.timeMin -= time.timeMin;
        this.timeHour -= time.timeHour;
        correctTime();
    }

    void correctTime(){
        int totalSec = timeHour * 3600 + timeMin * 60 + timeSec;
        timeHour = totalSec / 3600;
        timeMin = (totalSec % 3600) / 60;
        timeSec = (totalSec % 3600) % 60;
    }
    @Override
    public String toString(){
        return timeHour + ":" + timeMin + ":" + timeSec;
    }
}
