package com.example.task02;

public class TimeSpan {
    //Поля класса
    private int hSpan;
    private int mSpan;
    private int sSpan;

    //Конструктор
    public TimeSpan(int hSpan, int mSpan, int sSpan) {
        this.hSpan = hSpan;
        this.mSpan = mSpan;
        this.sSpan = sSpan;
        normalize();
    }

    //Геттеры
    public Integer getHours() {
        return hSpan;
    }

    public Integer getMin() {
        return mSpan;
    }

    public Integer getSec() {
        return sSpan;
    }

    //Сеттеры
    public void setHours(int hSpan) {
        this.hSpan = hSpan;
    }

    public void setMin(int hSpan) {
        this.mSpan = hSpan;
    }

    public void setSec(int hSpan) {
        this.sSpan = hSpan;
    }

    //Добавляет к текущему интервалу значение переданного интервала в минутах
    public void add(TimeSpan time) {
        this.hSpan += time.hSpan;
        this.mSpan += time.mSpan;
        this.sSpan += time.sSpan;
        normalize();
    }

    void subtract(TimeSpan time) {
        int tempTime1 = this.hSpan * 3600 + this.mSpan * 60 + this.sSpan;
        int tempTime2 = time.hSpan * 3600 + time.mSpan * 60 + time.sSpan;

        int difference = tempTime1 - tempTime2;

        if (difference <= 0) {
            this.hSpan = 0;
            this.mSpan = 0;
            this.sSpan = 0;
        } else {
            this.hSpan = difference / 3600;
            this.mSpan = (difference % 3600) / 60;
            this.sSpan = difference % 60;
        }
    }

    public String toString() {
        normalize();
        return String.format("%02d:%02d:%02d", hSpan, mSpan, sSpan);
    }

    private void normalize() {
        if (sSpan >= 60) {
            mSpan += sSpan / 60;
            sSpan = sSpan % 60;
        }
        else if (mSpan >= 60) {
            hSpan += mSpan / 60;
            mSpan = mSpan % 60;
        }
    }

}
