package com.example.task02;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hours: ");
        int hours = in.nextInt();

        System.out.println("Minutes: ");
        int minutes = in.nextInt();

        System.out.println("Seconds: ");
        int seconds = in.nextInt();

        TimeSpan time = new TimeSpan(hours,minutes,seconds);
        TimeSpan time2 = new TimeSpan(5,5,7);

        time.add(time2);
        System.out.println("Sum of intervals = " + time);

        time.subtract(time2);
        System.out.println("Interval difference = " + time);

        System.out.println(time.toString());

    }
}
