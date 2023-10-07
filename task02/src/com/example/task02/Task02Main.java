package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(1,132,333);
        /* System.out.println(time.toString()); **/
        time.add(new TimeSpan(1,1,1));
        System.out.println(time.toString());
    }
}
