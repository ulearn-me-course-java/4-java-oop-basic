package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {

        return minutes;
    }

    public int getSeconds() {

        return seconds;
    }

    /**
     * Устанавливает значение поля hours (часть значения временного интервала, выраженная в часах).
     * Поскольку временной интервал это неотрицательная величина, поле hours не может быть отрицательным,
     * поэтому при попытке установить отрицательное значение метод вызывает исключение.
     *
     * @param hoursValue
     * @throws IllegalArgumentException
     */
    public void setHours(int hoursValue) throws IllegalArgumentException {
        if (hoursValue < 0) {
            throw new IllegalArgumentException("hours is out of range.");
        }
        this.hours = hoursValue;
    }

    /**
     * Устанавливает значение поля minutes (часть значения временного интервала, выраженная в минутах).
     * Поскольку поле minutes может принимать значения только в пределах интервала от 0 до 59,
     * при выходе за пределы интервала, метод вызывает исключение.
     *
     * @param minutesValue
     * @throws IllegalArgumentException
     */
    public void setMinutes(int minutesValue) throws IllegalArgumentException {
        if (minutesValue < 0 || minutesValue >= 60) {
            throw new IllegalArgumentException("minutes is out of range.");
        }
        this.minutes = minutesValue;
    }

    /**
     * Устанавливает значение поля seconds (часть значения временного интервала, выраженная в секундах).
     * Поскольку поле seconds может принимать значения только в пределах интервала от 0 до 59,
     * при выходе за пределы интервала, метод вызывает исключение.
     *
     * @param secondsValue
     * @throws IllegalArgumentException
     */
    public void setSeconds(int secondsValue) throws IllegalArgumentException {
        if (secondsValue < 0 || secondsValue >= 60) {
            throw new IllegalArgumentException("seconds is out of range.");
        }
        this.seconds = secondsValue;
    }

    TimeSpan(int hoursValue, int minutesValue, int secondsValue) {
        setHours(hoursValue);
        setMinutes(minutesValue);
        setSeconds(secondsValue);
    }

    /**
     * Вычисляет сумму текущего временного интервала и интервала, переданного в качестве аргумента.
     *
     * @param timeSpan
     */
    void add(TimeSpan timeSpan) {
        //Вычисляется сумма значений интервалов в секундах
        int timeSpan1 = this.getHours() * 3600 + this.getMinutes() * 60 + this.getSeconds();
        int timeSpan2 = timeSpan.getHours() * 3600 + timeSpan.getMinutes() * 60 + timeSpan.getSeconds();
        int sum = timeSpan1 + timeSpan2;
        this.setHours(sum / 3600);
        sum = sum - (this.getHours() * 3600);
        this.setMinutes(sum / 60);
        sum = sum - (this.getMinutes() * 60);
        this.setSeconds(sum);
    }

    /**
     * Вычисляет разность текущего временного интервала и интервала, переданного в качестве аргумента.
     * В ходе вычислений производится проверка на неотрицательность получаемого на выходе значения иентервала,
     * поскольку временной интервал не может принимать отрицательное значение.
     *
     * @param timeSpan
     */
    void subtract(TimeSpan timeSpan) {
        //Вычисляется разность значений интервалов в секундах
        int timeSpan1 = this.getHours() * 3600 + this.getMinutes() * 60 + this.getSeconds();
        int timeSpan2 = timeSpan.getHours() * 3600 + timeSpan.getMinutes() * 60 + timeSpan.getSeconds();
        int difference = timeSpan1 - timeSpan2;
        if (difference > 0) {
            this.setHours(difference / 3600);
            difference = difference - (this.getHours() * 3600);
            this.setMinutes(difference / 60);
            difference = difference - (this.getMinutes() * 60);
            this.setSeconds(difference);
        } else {
            System.out.println("The time span must be non-negative. Subtraction is not done.");
        }
    }

    /**
     * Возвращает строковое представление временного интервала в формате: [00:00:00]
     *
     * @return
     */
    public String toString() {
        String result = "[" + getHours() + ":";
        if (getMinutes() < 10)
            result += "0";
        result += +getMinutes() + ":";
        if (getSeconds() < 10)
            result += "0";
        result += getSeconds() + "]";
        return result;
    }
}
