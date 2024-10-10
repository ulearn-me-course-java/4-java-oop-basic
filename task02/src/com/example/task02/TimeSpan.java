package com.example.task02;

public class TimeSpan {
    private int Hour;
    private int Min;
    private int Sec;

    public TimeSpan(int hour, int min, int sec) {
        this.Hour = hour;
        this.Min = min;
        this.Sec = sec;
    }

    public int gethours() {
        return Hour;
    }

    public void sethours(int hour) {
        this.Hour = hour;
    }


    public int getMin() {
        return Min;
    }

    public void setmin(int min) {
        this.Min = min;
    }


    public int getsec() {
        return Sec;
    }

    public void setsec(int sec) {
        this.Sec = sec;
    }

    public void corectTime(int hour, int min, int sec) {

        if (min > 59) {
            hour += min / 60;
            min %= 60;
        }
        if (sec > 59) {
            min += sec / 60;
            sec %= 60;
        }
    }

    public void add(TimeSpan time) {
        corectTime(Hour+time.Hour,Min+time.Min,Sec+time.Sec);

    }
    public void subtract(TimeSpan time)
    {
        corectTime(Math.abs(Hour - time.Hour), Math.abs(Min - time.Min), Math.abs(Sec - time.Sec));
    }
    public String toString(){
        return String.format("%d:%d:%d", Hour, Min, Sec);
    }

}
