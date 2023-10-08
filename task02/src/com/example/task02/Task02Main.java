package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan span = new TimeSpan(1, 30, 0);
        TimeSpan span1 = new TimeSpan(0, 50, 120);


        span.subtract(span1);

        System.out.println(span1);
    }
}