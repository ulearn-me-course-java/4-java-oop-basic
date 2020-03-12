package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan();
        timeSpan.add(new TimeSpan(1, 25, 46));
        timeSpan.subtract(new TimeSpan(0, 1, 55));
        System.out.println(timeSpan.toString());
    }
}
