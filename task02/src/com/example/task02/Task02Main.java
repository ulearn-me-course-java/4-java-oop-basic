package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timey = new TimeSpan(1, 30, 50);
        TimeSpan time = new TimeSpan(23, 30, 11);
        time.add(timey);
        System.out.println(time);
    }
}
