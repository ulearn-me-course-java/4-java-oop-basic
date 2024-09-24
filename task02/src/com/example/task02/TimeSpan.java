package com.example.task02;

public class TimeSpan {
    private int Hours;
    private int Mins;
    private int Secs;

    public TimeSpan(int hours, int mins, int secs){
        timeFormat(hours, mins, secs);
    }

    public void timeFormat(int hours, int mins, int secs){
        if(secs > 59){
            mins += secs/60;
            secs %= 60;
        }
        if(mins > 59){
            hours += mins/60;
            mins %= 60;
        }

        Hours = hours;
        Mins = mins;
        Secs = secs;
    }

    public void add(TimeSpan time){
        timeFormat(Math.abs(Hours + time.Hours), Math.abs(Mins + time.Mins), Math.abs(Secs + time.Secs));
    }

    public void subtract(TimeSpan time){
        timeFormat(Math.abs(Hours - time.Hours), Math.abs(Mins - time.Mins), Math.abs(Secs - time.Secs));
    }

    public String toString() {
        return String.format("%d:%d:%d", Hours, Mins, Secs);
    }
}
