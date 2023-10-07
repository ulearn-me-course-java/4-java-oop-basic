package com.example.task02;

import java.sql.Time;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(1,5,23);
        TimeSpan time2 = new TimeSpan(0,7, 58);
        time1.subtract(time2);
        System.out.println(time1.toString());
    }
}
