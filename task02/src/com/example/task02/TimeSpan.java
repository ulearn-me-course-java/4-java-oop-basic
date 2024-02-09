package com.example.task02;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;
    public int getHours(){
        return Hours;
    }
    public void setHours(int hours){
        Hours = hours;
        transformTime();
    }
    public int getMinutes(){
        return Minutes;
    }
    public void setMinutes(int minutes){
        Minutes = minutes;
        transformTime();
    }
    public int getSeconds(){
        return Seconds;
    }
    public void setSeconds(int seconds){
        Seconds = seconds;
        transformTime();
    }
    public TimeSpan(int hours, int minutes, int seconds){
        Hours = hours;
        Minutes = minutes;
        Seconds = seconds;
        transformTime();
    }
    private void transformTime(){
        Minutes = Minutes + Seconds / 60;
        Seconds = Seconds % 60;
        Hours += Minutes / 60;
        Minutes %= 60;
    }
    public void add(TimeSpan time){
        this.Hours += time.Hours;
        this.Minutes += time.Minutes;
        this.Seconds += time.Minutes;
        transformTime();
    }
    public void subtract(TimeSpan time) {
        Hours -= time.getHours();
        Minutes -= time.getMinutes();
        Seconds -= time.getSeconds();
        transformTime();
    }
    public String toString(){
        return String.format("%d:%d:%d", Hours,Minutes,Seconds);
    }
}
