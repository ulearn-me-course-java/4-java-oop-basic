package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        normalize();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        normalize();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        normalize();
    }

    private void normalize() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        } else if (seconds < 0) {
            minutes -= (-seconds + 59) / 60;
            seconds = (seconds % 60 + 60) % 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        } else if (minutes < 0) {
            hours -= (-minutes + 59) / 60;
            minutes = (minutes % 60 + 60) % 60;
        }

        if (hours < 0) {
            hours = 0;
        }
    }

    public void add(TimeSpan time) {
        this.hours += time.getHours();
        this.minutes += time.getMinutes();
        this.seconds += time.getSeconds();
        normalize();
    }

    public void subtract(TimeSpan time) {
        this.hours -= time.getHours();
        this.minutes -= time.getMinutes();
        this.seconds -= time.getSeconds();
        normalize();
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(1, 70, 120);
        TimeSpan t2 = new TimeSpan(0, 30, 50);

        System.out.println("Первый интервал: " + t1);
        System.out.println("Второй интервал: " + t2);

        t1.add(t2);
        System.out.println("После сложения: " + t1);

        t1.subtract(new TimeSpan(2, 15, 30));
        System.out.println("После вычитания: " + t1);
    }
}