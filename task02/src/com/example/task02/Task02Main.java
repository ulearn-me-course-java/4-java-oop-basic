package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan ts = new TimeSpan(1,100,65);
        System.out.println(ts);
        ts.add(new TimeSpan(0,32, 45));
        System.out.println(ts);
        ts.subtract(new TimeSpan(1,74,39));
        System.out.println(ts);

    }
}
