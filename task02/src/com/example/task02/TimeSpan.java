package com.example.task02;

import java.math.BigDecimal;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;
    public int GetHours(){
        return this.Hours;
    }
    public int GetMinutes(){
        return this.Minutes;
    }
    public int GetSeconds(){
        return this.Seconds;
    }
    public void SetHours(int h){
        this.Hours = h;
    }
    public void SetMinutes(int m){
        this.Minutes = m % 60;
        SetHours(this.Hours + m / 60);
    }
    public void SetSeconds(int s){
        this.Seconds = s % 60;
        SetMinutes(this.Minutes + s / 60);
    }
    public TimeSpan(int hours, int minutes, int seconds){
        SetHours(hours);
        SetMinutes(minutes);
        SetSeconds(seconds);
    }
    void add(TimeSpan time){
    SetSeconds(time.Seconds);
    SetMinutes(time.Minutes);
    SetHours(time.Hours);
    }
    void subtract(TimeSpan time){
        BigDecimal t = new BigDecimal(time.Hours * 3600 + time.Minutes * 60 + time.Seconds);
        BigDecimal c = new BigDecimal(GetHours() * 3600 + GetMinutes() * 60 +GetSeconds());
        if (t.intValue() - c.intValue() <= 0){
            this.Seconds = 0;
            this.Minutes = 0;
            this.Hours = 0;
        }
        else {
            this.Seconds = (t.intValue() - c.intValue()) % 60;
            this.Minutes = (t.intValue() - c.intValue()) / 60;
            this.Hours = (t.intValue() - c.intValue()) % 3600;
        }
    }
    public String toString(){
        String s = Integer.toString(GetSeconds());
        String m = Integer.toString(GetMinutes());
        String h = Integer.toString(GetHours());
        return h + "," + m + "," + s;
    }
}
