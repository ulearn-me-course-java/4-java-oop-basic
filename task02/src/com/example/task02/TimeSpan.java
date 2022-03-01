package com.example.task02;

public class TimeSpan {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;
    public TimeSpan(int hours,int minutes,int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        correctData();
    }
    public TimeSpan(int hours,int minutes){
        this.hours = hours;
        this.minutes = minutes;
        correctData();
    }
    public TimeSpan(int hours){
        this.hours = hours;
    }
    public TimeSpan(){}

    public void add(TimeSpan time){
        if(time != null){
            this.hours = time.hours;
            this.minutes = time.minutes;
            this.seconds = time.seconds;
        }
    }
    public void subtract(TimeSpan time) throws Exception {
        if(time != null){
            this.hours -= time.hours;
            this.minutes -= time.minutes;
            this.seconds -= time.seconds;
            if(time.seconds < 0 || time.minutes < 0 || time.hours < 0){
                throw new Exception("incorrect timeSpawn");
            }
        }
    }
    public int getHours(){
        return this.hours;
    }
    public void setHours(int value) throws Exception {
        if(value >= 0){
            this.hours = value;
        }
        else{
            throw new Exception("hours can't be negative");
        }
    }
    public int getMinutes(){
        return this.minutes;
    }
    public void setMinutes(int value) throws Exception {
        if(value >= 0){
            this.minutes = value;
        }
        else{
            throw new Exception("minutes can't be negative");
        }
    }
    public int getSeconds(){
        return this.seconds;
    }
    public void setSeconds(int value) throws Exception {
        if(value >= 0){
            this.seconds = value;
        }
        else{
            throw new Exception("seconds can't be negative");
        }
    }
    private void correctData(){
        while(seconds >= 60){
            seconds -= 60;
            minutes +=1;
        }
        while(minutes >= 60){
            minutes -= 60;
            hours +=1;
        }
    }
    @Override
    public String toString () {
        return String.format("(hours: %s,minutes: %s, seconds: %s)", this.hours,this.minutes,this.seconds);
    }
}
