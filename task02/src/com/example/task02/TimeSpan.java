package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;


    public int getHourse(){
        return hours;
    }
    public void setHours(int hours){
        this.hours = hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    public TimeSpan(int hours, int minutes, int seconds){
        convert(hours, minutes, seconds);
    }
    void convert(int hours, int minutes, int seconds){
        while(minutes > 60){
            hours += 1;
            minutes -= 60;
        }
        while (seconds > 60){
            minutes += 1;
            seconds -= 60;
        }
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    /*void check(TimeSpan time){
        if(minutes < time.minutes){
            hours -=1;
            minutes+=60;
            minutes-= time.minutes;
        }
        if (seconds < time.seconds){
            minutes -=1;
            seconds+=60;
            seconds-= time.seconds;
        }
    }*/
    void add(TimeSpan time){
        hours += time.getHourse();
        minutes += time.getMinutes();
        seconds += time.getSeconds();
        convert(hours,minutes,seconds);
    }
    void subtract(TimeSpan time){
        hours -= time.getHourse();
        minutes -= time.getMinutes();
        seconds -= time.getSeconds();
        convert(hours,minutes,seconds);
    }
    public String toString(){
        return (getHourse()+"часа"+getMinutes()+"минут"+getSeconds()+"секунд");
    }
}

