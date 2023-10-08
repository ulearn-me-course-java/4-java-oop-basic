package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan();
        TimeSpan time2 = new TimeSpan(1, 65, 50);
        //time1.setSecond(1);
        System.out.println(time2.toString());
    }
}
