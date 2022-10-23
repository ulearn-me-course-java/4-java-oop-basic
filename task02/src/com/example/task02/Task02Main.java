package com.example.task02;

import java.io.Console;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timeOne = new TimeSpan(2,4,10);
        TimeSpan timeTwo = new TimeSpan(0,6,160);
        //timeOne.add(timeTwo);
        timeOne.subtract(timeTwo);
        System.out.println(timeOne.toString());
    }
}
