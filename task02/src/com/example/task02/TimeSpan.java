package com.example.task02;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;
    public int getHours(){
        return Hours;
    }
    public int getMinutes(){
        return Minutes;
    }
    public int getSeconds(){
        return Seconds;
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
    public void subtract(TimeSpan time){
        if(time.Hours > this.Hours){
            return;
        }
        this.Hours -= time.Hours;
        if(time.Minutes > this.Hours){
            if(this.Hours > 0){
                this.Hours -= 1;
                this.Minutes += 60 - time.Minutes;
            }
            else{
                this.Hours += time.Hours;
                return;
            }
        }
        this.Minutes -= time.Minutes;
        if(time.Seconds > this.Seconds){
            if (this.Minutes > 0) {
                this.Minutes -= 1;
                this.Seconds += 60 - time.Seconds;
            }
            else {
                if (this.Hours > 0) {
                    this.Hours -= 1;
                    this.Minutes += 59;
                    this.Seconds += 60 - time.Seconds;
                }
                else {
                    this.Hours += time.Hours;
                    this.Minutes += time.Minutes;
                    return;
                }
            }
        }
        this.Seconds -= time.Seconds;
        transformTime();
    }
    public String toString(){
        return String.format("%d:%d:%d", Hours,Minutes,Seconds);
    }
}
