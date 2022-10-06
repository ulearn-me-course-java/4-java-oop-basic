package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public  TimeSpan(){}

    public TimeSpan(int h,int m,int s){
        this.hours=h;
        this.minutes=m;
        this.seconds=s;
        Check();
    }

    private void Check()
    {
        if(this.seconds>=60){
            this.minutes+=seconds/60;
            this.seconds=seconds%60;
        }
        if(this.minutes>=60){
            this.hours+=minutes/60;
            this.minutes=minutes%60;
        }
    }

    public int getHours(){
        return hours;
    }
    public void setHours(int number){
        this.hours=number;
    }

    public int getMinutes(){
        return minutes;
    }
    public void setMinutes(int number){
        this.minutes=number;
        Check();
    }

    public int getSeconds(){
        return seconds;
    }
    public void setSeconds(int number){
        this.seconds=number;
        Check();
    }

    public void add(TimeSpan time){
        this.hours+= time.getHours();
        this.minutes+=time.getMinutes();
        this.seconds+=time.getSeconds();
        Check();
    }

    public void subtract(TimeSpan time){
        this.hours-= time.getHours();
        this.minutes-=time.getMinutes();
        this.seconds-=time.getSeconds();
        Check();
    }

    public String toString(){
        return String.format("%d:%d:%d",this.hours,this.minutes,this.seconds);
    }
}
