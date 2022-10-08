package com.example.task02;

public class TimeSpan {
    private int hh;
    private  int mi;
    private int ss;

    public int getHh() {
        return hh;
    }
    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMi() {
        return mi;
    }
    public void setMi(int mi) {
        this.mi = mi;
    }

    public int getSs() {
        return ss;
    }
    public void setSs(int ss) {
        this.ss = ss;
    }

    public TimeSpan(int hh, int mi, int ss){
        this.ss = ss;
        this.mi = mi;
        this.hh = hh;
        convertDate();
    }
    private void convertDate(){
        if (ss >= 60){
            mi += ss / 60;
            setSs(getSs() - (getSs() /60) * 60);
        }
        if (mi >= 60) {
            hh += mi / 60;
            setMi(getMi() - (getMi() / 60) * 60);
        }
    }
    void add(TimeSpan time){
        setSs(getSs() + time.getSs());
        setMi(getMi() + time.mi);
        setHh(getHh() + time.hh);
        convertDate();
    }
    void subtract(TimeSpan time){
        setSs(getSs() - time.getSs());
        setMi(getMi() - time.mi);
        setHh(getHh() - time.hh);
        convertDate();
    }
    public String toString(){
        return String.format("(%d:%d:%d)",hh,mi,ss);
    }
}

