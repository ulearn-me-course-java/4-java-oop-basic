package com.example.task02;

public class TimeSpanPrinter {
    private TimeSpan _timeSpan;

    public TimeSpanPrinter(TimeSpan timeSpan) {
        System.out.print(String.format("new Timespan(%dh, %dm, %ds)\n",
                timeSpan.getHours(),
                timeSpan.getMinutes(),
                timeSpan.getSeconds()));

        _timeSpan = timeSpan;
    }

    public TimeSpanPrinter addPrint(TimeSpan t2) {
        System.out.print(_timeSpan + " + " + t2 + "\n");

        _timeSpan.add(t2);

        System.out.print(" = " + _timeSpan);

        return this;
    }

    public TimeSpanPrinter subtractPrint(TimeSpan t2) {
        System.out.print(_timeSpan + " - " + t2 + "\n");

        _timeSpan.subtract(t2);

        System.out.print(" = " + _timeSpan);

        return this;
    }
}
