package com.example.task02;

public class TimeSpan {

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;


    public int getHours() {
        return this.hours;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public int getSeconds() {
        return this.seconds;
    }


    private void addHours(int t) {
        if (t < 0) return;
        this.hours += t;
    }
    private void addMinutes(int t) {
        if (t < 0) return;
        this.minutes += t % 60;

        if (this.minutes >= 60) {
            t += this.minutes / 60;
            this.minutes %= 60;
        }

        if (t >= 60)
            addHours(t / 60);
    }
    private void addSeconds(int t) {
        if (t < 0) return;
        this.seconds += t % 60;
        if (this.seconds >= 60)
            t /= 60;

        if (this.seconds >= 60) {
            t += this.seconds / 60;
            this.seconds %= 60;
        }

        if (t > 0) {
            addMinutes(t / 60);
        }
    }


    public TimeSpan(int a, int b, int c) {
        addSeconds(c);
        addMinutes(b);
        addHours(a);
    }


    public void add(TimeSpan time) {
        addSeconds(time.getSeconds());
        addMinutes(time.getMinutes());
        addHours(time.getHours());
    }
    public void subtract(TimeSpan time) {
        this.seconds -= time.getSeconds();
        if (this.seconds < 0) {
            this.seconds += 60;
            this.minutes--;
        }

        this.minutes -= time.getMinutes();
        if (this.minutes < 0) {
            this.minutes += 60;
            this.hours--;
        }

        this.hours -= time.getSeconds();
    }


    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
