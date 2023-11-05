package com.example.task02;

class TimeSpan {
    private int hours = 0;
    private int second = 0;
    private int minutes = 0;

    public void getHours(int hours) {
        setHours(hours);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void getSecond(int second) {
        setSecond(second);
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void getMinutes(int minutes) {
        setMinutes(minutes);
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    TimeSpan(int second, int minutes, int hours) {
        getHours(hours);
        getSecond(second);
        getMinutes(minutes);

        checker();
    }

    public void add(TimeSpan time) {
        this.hours += time.hours;
        this.second += time.second;
        this.minutes += time.minutes;

        checker();
    }

    public String toString() {
        return String.format("second: %d, minutes: %d, hours: %d%n", this.second, this.minutes, this.hours);
    }

    private void checker() {
        if (second >= 60) {
            minutes += second / 60;
            second = second % 60;
        } else if (second <= -1) {
            if (second <= 60) {
                this.minutes += second / 60;
            }
            second = 60 + (second % 60);
        }

        if (minutes >= 60) {
            this.hours += minutes / 60;
            minutes = minutes % 60;
        } else if (minutes <= -1) {
            if (minutes <= 60) {
                this.hours += minutes / 60;
            }
            minutes = 60 + (minutes % 60);
        }

        if (hours >= 24) {
            hours = hours % 24;
        } else if (hours <= -1) {
            if (hours <= 24) {
                hours = 24 + (hours % 24);
            }
            hours += 24;
        }
    }

    public void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.second -= time.second;
        this.minutes -= time.minutes;

        checker();
    }
}
