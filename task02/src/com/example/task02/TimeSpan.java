package com.example.task02;

public class TimeSpan {
    private int hours, minutes, seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes + hours * 60;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60){
            this.minutes = minutes % 60;
            hours += minutes / 60;
        }
        else this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds + getMinutes() * 60;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 3600){
            this.seconds = convertSeconds(seconds);
            minutes += convertMinutes(seconds);
            if (minutes >= 60)
                setMinutes(minutes);
            hours += convertHours(seconds);
        }
        else this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    void add(TimeSpan timeSpan){
        plus(timeSpan, true);
    }

    void subtract(TimeSpan timeSpan){
        plus(timeSpan, false);
    }

    private void plus(TimeSpan timeSpan, boolean isPlus){
        if (timeSpan == null)
            throw new NullPointerException("timespan is null");
        int allSeconds = isPlus ? getSeconds() + timeSpan.getSeconds()
                : getSeconds() - timeSpan.getSeconds();
        hours = convertHours(allSeconds);
        minutes = convertMinutes(allSeconds);
        seconds = convertSeconds(allSeconds);
    }

    private int convertMinutes(int minutes){
        return  (minutes % 3600) / 60;
    }

    private int convertSeconds(int seconds){
        return (seconds % 3600) % 60;
    }

    private int convertHours(int seconds){
        return seconds / 3600;
    }
}
