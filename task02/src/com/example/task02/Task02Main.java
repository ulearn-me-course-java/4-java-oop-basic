package com.example.task02;

class TimeSpan {
    private int sec;
    private int min;
    private int hour;

    public TimeSpan (int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if(sec > 60) {
            this.sec = sec % 60;
            setMin(sec / 60);
        }
        else if (sec < 0){
            setMin(min - 1);
            this.sec = 60 - sec;
        }
        else {
            this.sec = sec;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if(min > 60) {
            this.min = min % 60;
            setHour(min / 60);
        }
        else if (min < 0){
            setHour(hour - 1);
            this.min = 60 - min;
        }
        else {
            this.min = min;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour >= 0)
            this.hour = hour;
    }

    public void add(TimeSpan time) {
        setSec(time.sec + sec);
        setMin(time.min + min);
        setHour(time.hour + hour);
    }

    public void subtract(TimeSpan time) {
        setSec(-time.sec);
        setMin(-time.min);
        setHour(-time.hour);
    }

    public String toString() {
        return Integer.toString(hour) + " h " + Integer.toString(min) + " m " + Integer.toString(sec) + " s";
    }
}

public class Task02Main {
    public static void main(String[] args) {

    }
}
