package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int h) throws IllegalArgumentException {
        if (h < 0)
            throw new IllegalArgumentException("hours is out of range.");
        hours = h;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int m) throws IllegalArgumentException {
        if (m < 0 || m >= 60)
            throw new IllegalArgumentException("minutes is out of range.");
        minutes = m;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int s) throws IllegalArgumentException {
        if (s < 0 || s >= 60)
            throw new IllegalArgumentException("seconds is out of range.");
        seconds = s;
    }

    TimeSpan(int h, int m, int s) {
        setHours(h);
        setMinutes(m);
        setSeconds(s);
    }

    void add(TimeSpan time) {
        int min_carry = 0, sec_carry = 0;
        sec_carry = (this.getSeconds() + time.getSeconds()) / 60;
        setSeconds((this.getSeconds() + time.getSeconds()) % 60);
        min_carry = (this.getMinutes() + time.getMinutes() + sec_carry) / 60;
        setMinutes((this.getMinutes() + time.getMinutes() + sec_carry) % 60);
        setHours(this.getHours() + time.getHours() + min_carry);
    }

    void subtract(TimeSpan time) {
        int min_carry = 0, sec_carry = 0;
        if ((this.getSeconds() - time.getSeconds()) < 0)
            sec_carry = 1;
        int sec = this.getSeconds() - time.getSeconds();
        setSeconds(sec < 0 ? 60 + sec : sec % 60);

        if ((this.getMinutes() - time.getMinutes()) < 0)
            min_carry = 1;
        int min = this.getMinutes() - time.getMinutes();
        setMinutes(min < 0 ? 60 + min : min % 60);

        if ((this.getHours() - time.getHours() - min_carry) < 0) {
            System.out.println("The time span must be non-negative");
            setHours(0);
            setMinutes(0);
            setSeconds(0);
            return;
        }
        setHours(this.getHours() - time.getHours() - min_carry);
    }

    public String toString() {
        String result = "[" + getHours() + ":";
        if (getMinutes() < 10)
            result += "0";
        result += +getMinutes() + ":";
        if (getSeconds() < 10)
            result += "0";
        result += getSeconds() + "]";
        return result;
    }
}
