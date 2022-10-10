package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(1, 20, 40);
        TimeSpan time2 = new TimeSpan(1, 119, 62);
        TimeSpan time3 = new TimeSpan(1, 20, 40);
        TimeSpan time4 = new TimeSpan(0, 120, 0);

        time1.add(time3);

        System.out.println(time1);
        System.out.println(time2);

        time2.subtract(time4);

        System.out.println(time2);

    }
}
