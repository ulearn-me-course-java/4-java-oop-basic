package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        setCorrectTime();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond(){
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

    public void add(TimeSpan time){
        this.hour+=time.getHour();
        this.minute+=time.getMinute();
        this.second+=time.getSecond();
        setCorrectTime();
    }

    public void subtract(TimeSpan time){
        this.hour-=time.getHour();
        this.minute-=time.getMinute();
        this.second-=time.getSecond();
        setCorrectTime();
    }

    private void setCorrectTime() {
        if (this.minute < 0){
            this.hour =this.hour - (minute / 60) + 1;
            this.minute = 60 + this.minute;
        }

        if (this.minute > 60) {
            this.hour += this.minute / 60;
            this.minute = this.minute % 60;
        }

        if (this.second>60){
            this.minute+=this.second/60;
            this.second=this.second%60;
        }
    }

    public String toString(){
        return "Correct time (hh:mm:ss):"+this.hour+":"+this.minute+":"+this.second;
    }


}
