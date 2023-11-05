package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan ts1 = new TimeSpan(1,0,10);
        TimeSpan ts2 = new TimeSpan(0,0,59);

        System.out.println(ts1);
        System.out.println(ts2);
        ts1.subtract(ts2);
        System.out.println(ts1);
    }
}
