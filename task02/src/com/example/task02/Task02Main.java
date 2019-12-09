package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan(10, 10, 10);
        TimeSpan timeSpan1 = new TimeSpan(10, 49, 50);
        timeSpan.add(timeSpan1);
        System.out.println(timeSpan);
    }
}