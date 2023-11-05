package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    private void normalize() {
        minutes += seconds / 60;
        seconds %= 60;
        hours += minutes / 60;
        minutes %= 60;

        if (seconds < 0) {
            seconds = 60 + seconds;
            minutes--;
        }
        if (minutes < 0) {
            minutes = 60 + minutes;
            hours--;
        }
        if (hours < 0) {
            throw new AssertionError("Промежуток времени отрицательный");
        }
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
        this.minutes = Math.min(Math.max(0, minutes), 59);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = Math.min(Math.max(0, seconds), 59);
    }

    public void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        normalize();
    }

    public void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
        normalize();
    }

    public String toString() {
        String output = "";

        if (hours > 0)
            if (hours == 1)
                output += hours + " час ";
            else if (hours <= 4)
                output += hours + " часа ";
            else
                output += hours + " часов ";

        if (minutes > 0)
            if (minutes == 1)
                output += minutes + " минута ";
            else if (minutes <= 4)
                output += minutes + " минуты ";
            else
                output += minutes + " минут ";
        else if (hours > 0)
            output += minutes + " минут ";

        if (seconds == 1)
            output += seconds + " секунда ";
        else if (seconds >= 2 && seconds <= 4)
            output += seconds + " секунды ";
        else
            output += seconds + " секунд ";

        return output;
    }
}
