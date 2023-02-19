package com.example.task02;

import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input time:");

        System.out.print("    Hour: ");
        int h = in.nextInt();

        System.out.print("    Minute: ");
        int m = in.nextInt();

        System.out.print("    Second: ");
        int s = in.nextInt();

        TimeSpan time = new TimeSpan(h,m,s);
        TimeSpan time2 = new TimeSpan(0,50,70);

        time.add(time2);
        System.out.println("+: " + time);

        time.subtract(time2);
        System.out.println("-: " + time);

        System.out.println(time.toString());
    }
}
