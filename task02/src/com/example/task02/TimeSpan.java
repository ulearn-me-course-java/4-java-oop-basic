package com.example.task02;

public class TimeSpan {
    private  int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public TimeSpan(int seconds, int minutes, int hours){
        setSeconds(seconds);
        setMinutes(minutes);
        this.hours += hours;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        if(seconds < 60){
            this.seconds = seconds;
        }else{
            this.seconds = seconds % 60;
            this.minutes += seconds / 60;
        }
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        if(minutes < 60){
            this.minutes = minutes;
        }else{
            this.minutes = minutes % 60;
            this.hours += minutes / 60;
        }
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void add(TimeSpan time){
        if(seconds + time.seconds < 60){
            seconds += time.seconds;
        }else{
            seconds = (seconds + time.seconds) % 60;
            minutes += (seconds + time.seconds) / 60;
        }
        if(minutes + time.minutes < 60){
            minutes += time.minutes;
        }else{
            minutes = (minutes + time.minutes) % 60;
            hours += (minutes + time.minutes) / 60;
        }
        hours += time.hours;;
    }

    public void subtract(TimeSpan time){
        if(seconds - time.seconds >= 0){
            seconds -= time.seconds;
        }else{
            if(minutes != 0){
                minutes -= 1;
                seconds = seconds - time.seconds + 60;
            }else if (hours != 0){
                hours -= 1;
                minutes += 59;
                seconds = seconds - time.seconds + 60;
            }else{
                return;
            }
        }
        if(minutes - time.minutes >= 0){
            minutes -= time.minutes;
        }else if(hours != 0){
            hours -= 1;
            minutes = minutes - time.minutes + 60;
        }else{
            return;
        }
        if(hours - time.hours >= 0){
            hours -= time.hours;
        }else{
            return;
        }
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(hours).append("ч").append(" ").append(minutes).append("м").append(" ").append(seconds).append("с");
        return str.toString();
    }
}