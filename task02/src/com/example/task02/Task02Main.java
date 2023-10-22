package com.example.task02;

import java.sql.Time;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(17, 30, 30);
        TimeSpan time2 = new TimeSpan(5, 30, 30);
        time1.add(time2);
        System.out.println(time1.toString());
    }
}
