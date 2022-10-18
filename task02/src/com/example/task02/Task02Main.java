package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan(1,99,65);
        System.out.println(timeSpan);
        timeSpan.add(new TimeSpan(0,30, 45));
        System.out.println(timeSpan);
        timeSpan.subtract(new TimeSpan(1,75,40));
        System.out.println(timeSpan);
    }
}