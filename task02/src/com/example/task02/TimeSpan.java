package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    TimeSpan(int hours, int minutes, int secs) {
        this.hours = hours + minutes / 60 + secs / 3600;
        this.minutes = (secs / 60 + minutes) % 60;
        this.seconds = secs % 60;
    }

    void add(TimeSpan time) {
        if (time == null) {
            throw new IllegalArgumentException();
        }
        int min = (this.seconds + time.seconds) / 60;
        int hour = (this.minutes + time.minutes) / 60;
        this.seconds = (this.seconds + time.seconds) % 60;
        this.minutes = (this.minutes + time.minutes + min) % 60;
        this.hours = (this.hours + time.hours + hour);
    }

    void subtract(TimeSpan time) {
        if (time == null) {
            throw new IllegalArgumentException();
        }
        if ((this.hours < time.hours) || (this.hours == time.hours && this.minutes < time.minutes) || (this.hours == time.hours && this.minutes == time.minutes && this.seconds < time.seconds)) {
            System.out.println("Текущеий временной интервал меньше введеного мереданного");
        } else {
            this.hours = this.hours - time.hours;
            this.minutes = this.minutes - time.minutes;
            this.seconds = this.seconds - time.seconds;
            if (this.seconds < 0) {
                while (this.seconds < 0) {
                    this.seconds = this.seconds + 60;
                    this.minutes = this.minutes - 1;
                }
            }
            if (this.minutes < 0) {
                while (this.minutes < 0) {
                    this.minutes = this.minutes + 60;
                    this.hours = this.hours - 1;
                }
            }
        }
    }

    public String toString() {
        return String.format("Часов: %d, Минут: %d, Секунд: %d", this.hours, this.minutes, this.seconds);
    }

    public int getHour() {
        return this.hours;
    }

    public int getMinute() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setHour(int hour) {
        this.hours = hour;
    }

    public void setMinute(int minute) {
        this.minutes = minute;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
