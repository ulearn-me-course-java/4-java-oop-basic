package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(1,40,0);
    }
}

class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
        convertFields();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int h) {
        hours = h;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int m) {
        minutes = m;
        convertFields();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int s) {
        seconds = s;
        convertFields();
    }

    void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        convertFields();
    }

    void subtract(TimeSpan time) {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        totalSeconds -= time.hours * 3600 + time.minutes * 60 + time.seconds;

        seconds = totalSeconds;
        convertFields();
    }

    public String toString() {
        return hours + " часов " + minutes + " минут " + seconds + " секунд";
    }

    private void convertFields() {
        int h = hours, m = minutes, s = seconds;
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }
}


