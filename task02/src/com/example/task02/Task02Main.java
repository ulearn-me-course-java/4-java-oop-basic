package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan ts = new TimeSpan(1,100,65);
        System.out.println(ts);
        ts.add(new TimeSpan(2,37, 79));
        System.out.println(ts);
        ts.subtract(new TimeSpan(3,54,21));
        System.out.println(ts);
    }
}