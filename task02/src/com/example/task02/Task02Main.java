package com.example.task02;

import java.util.concurrent.TimeUnit;

public class Task02Main {
    public static void main(String[] args) {

        TimeSpan time = new TimeSpan(12,245,315);

        System.out.println(time.toString());

        TimeSpan time2 = new TimeSpan(2,15,45);

        time.add(time2);

        System.out.println(time.toString());

    }
}
