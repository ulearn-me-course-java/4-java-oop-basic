package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(1, 100, 25);
        TimeSpan time2 = new TimeSpan(2, 61, 65);
        TimeSpan time3 = new TimeSpan(0, 2, 0);
        TimeSpan time4 = new TimeSpan(1, 0, 0);

        System.out.println(time1.toString());
        System.out.println(time2.toString());
        time3.add(time4);
        System.out.println(time3.toString());
        time4.subtract(time3);
        System.out.println(time4.toString());


    }
}
