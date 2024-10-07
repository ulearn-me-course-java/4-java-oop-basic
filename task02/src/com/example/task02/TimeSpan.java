package com.example.task02;

import java.sql.Time;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        correctTime(hours, minutes, seconds);
    }

    public int getHours(){
        return Hours;
    }

    public void setHours(int hours){
        this.Hours = hours;
    }

    public int getMinutes(){
        return Minutes;
    }

    public void setMinutes(int minutes){
        this.Minutes = minutes;
    }
    public int getSeconds(){
        return Seconds;
    }

    public void setSeconds(int seconds){
        this.Seconds = seconds;
    }

    public void correctTime(int hours, int minutes, int seconds){
        if (minutes > 59){
            hours += minutes/60;
            minutes %= 60;
        }
        if (seconds > 59){
            minutes += seconds/60;
            seconds %= 60;
        }
        Hours = hours;
        Minutes = minutes;
        Seconds = seconds;
    }

    void add(TimeSpan time){
        correctTime(Hours + time.Hours, Minutes + time.Minutes, Seconds + time.Seconds);
    }

    void subtract(TimeSpan time){
        correctTime(Math.abs(Hours - time.Hours), Math.abs( Minutes - time.Minutes), Math.abs(Seconds - time.Seconds));
    }

    @Override
    public String toString() {
        return String.format("%d часа %d минут %d секунд", Hours, Minutes, Seconds);
    }
}
