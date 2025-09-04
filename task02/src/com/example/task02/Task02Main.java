package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        TimeSpan timeSpan1 = new TimeSpan(2,30,0);
        TimeSpan timeSpan2 = new TimeSpan(1,40,0);

        timeSpan1.subtract(timeSpan2);
        timeSpan1.getHour();
        System.out.println(timeSpan1);
    }
}
