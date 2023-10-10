package com.example.task02;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        this.Hours = hours;
    }

    public int getMinutes() {
        return Minutes;
    }

    public void setMinutes(int minutes) {
        this.Minutes = minutes % 60;
        setHours(this.Hours + minutes / 60);
    }

    public int getSeconds() {
        return Seconds;
    }

    public void setSeconds(int seconds) {
        this.Seconds = seconds % 60;
        setMinutes(this.Minutes + seconds / 60);
    }

    public TimeSpan (int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    void add(TimeSpan time) {
        this.Hours = this.Hours + time.Hours;
        this.Minutes = this.Minutes + time.Minutes;
        this.Seconds = this.Seconds + time.Seconds;
    }

    void subtract(TimeSpan time) {
        int x = this.Hours * 3600 + this.Minutes * 60 + this.Seconds;
        int y = time.Hours * 3600 + time.Minutes * 60 + time.Seconds;
        if (x<=y) {
            this.Hours = 0;
            this.Minutes = 0;
            this.Seconds = 0;
        }
        else {
            this.Seconds = x - y;
        }
    }

    public String toString() {
        return this.Hours + "h" + this.Minutes + "m" + this.Seconds + "s";
    }
}
