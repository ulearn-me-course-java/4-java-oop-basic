package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan ts = new TimeSpan(0, 0, 1);
        ts.setSeconds(70);
        System.out.printf(ts.toString());
    }
}
