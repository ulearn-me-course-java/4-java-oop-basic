package com.example.task02;

public class TimeSpan {
    private int Hours;
    private int Mins;
    private int Sec;

    public TimeSpan(int hours, int mins, int sec){
        timeFormat(hours, mins, sec);
    }

    public void timeFormat(int hours, int mins, int sec){
        if(sec > 59){
            mins += sec/60;
            sec %= 60;
        }
        if(mins > 59){
            hours += mins/60;
            mins %= 60;
        }

        Hours = hours;
        Mins = mins;
        Sec = sec;
    }

    public void add(TimeSpan time){
        timeFormat(Math.abs(Hours + time.Hours), Math.abs(Mins + time.Mins), Math.abs(Sec + time.Sec));
    }

    public void subtract(TimeSpan time){
        timeFormat(Math.abs(Hours - time.Hours), Math.abs(Mins - time.Mins), Math.abs(Sec - time.Sec));
    }

    public String toString() {
        return String.format("%d:%d:%d", Hours, Mins, Sec);
    }
}
