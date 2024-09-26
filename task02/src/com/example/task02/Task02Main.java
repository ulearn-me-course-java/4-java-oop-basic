package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(12, 35, 12);
        int hours = time1.getHours();
        int seconds = time1.getSeconds();
        int minutes = time1.getMinutes();
        TimeSpan time2 = new TimeSpan(15, 55, 15);
        int hours2 = time2.getHours();
        int minutes2 = time2.getMinutes();
        int seconds2 = time2.getSeconds();

        time2.subtract(time1);

        String res = time2.getHours() + ":" + time2.getMinutes() + ":" + time2.getSeconds();
        System.out.println(res);

        time1.toString();
        System.out.println(time1);


    }
}
