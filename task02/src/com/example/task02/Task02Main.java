package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan ts = new TimeSpan(0, 30, 0);
        TimeSpan ts2 = new TimeSpan(0, 30, 0);
        System.out.println(ts);
        System.out.println(ts2);
        ts.subtract(ts2);
        System.out.println(ts);
    }
}
