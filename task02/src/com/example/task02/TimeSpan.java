package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int h, int m, int s){
        seconds = s;
        minutes = m;
        hours = h;
    }

    public int getHours(){ return hours; }
    public int getMinutes() { return minutes; }
    public int getSeconds() { return seconds; }

    public void setHours(int h) { hours = h; }
    public void setMinutes(byte m) { minutes = m; }
    public void setSeconds(byte s) { seconds = s; }

    void add(TimeSpan time){
        long dtimeSec = (hours * 3600 + minutes * 60 + seconds) +
                (time.hours * 3600 + time.minutes * 60 + time.seconds);

        this.hours = (int)(dtimeSec / 3600);
        this.minutes = (int)((dtimeSec %3600) / 60);
        this.seconds = (int)((dtimeSec % 3600) % 60);
    }

    void subtract(TimeSpan time){
        long dtimeSec = (hours * 3600 + minutes * 60 + seconds) -
                (time.hours * 3600 + time.minutes * 60 + time.seconds);

        if(dtimeSec < 0) dtimeSec = 0;

        this.hours = (int)(dtimeSec / 3600);
        this.minutes = (int)((dtimeSec %3600) / 60);
        this.seconds = (int)((dtimeSec % 3600) % 60);
    }

    public String toString(){
        return String.format("%d:%d.%d", this.hours, this.minutes, this.seconds);
    }
}