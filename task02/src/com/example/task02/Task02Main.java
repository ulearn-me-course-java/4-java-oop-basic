package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

        TimeSpan a = new TimeSpan(2,120,60);
        System.out.println(a.getHour() + " " + a.getMinute() + " " + a.getSecond());
    }
}
