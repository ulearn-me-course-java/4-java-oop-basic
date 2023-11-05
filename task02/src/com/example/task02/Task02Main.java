package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

        TimeSpan timeSpan1 = new TimeSpan(3,5,59);
        TimeSpan timeSpan2 = new TimeSpan(0,0,1);
        TimeSpan timeSpan3 = new TimeSpan(1,0,0);

        new TimeSpanPrinter(timeSpan1).addPrint(timeSpan2).subtractPrint(timeSpan3);
    }
}
