package com.nochitsoft.nochesky.model;

/**
 * Created by nochita on 2016-05-6.
 */
public class TimeFormat {
    private int hour;
    private int minute;
    private int second;
    private int maxHour;
    private boolean isPositive;

    public TimeFormat(int hour, int minute, int second, int maxHour, boolean isPositive) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
        this.maxHour = maxHour;
        this.setPositive(isPositive);
    }

    public TimeFormat(int hour, int minute, int second, int hourMaxima) {
        this(hour, minute, second, hourMaxima, true);
    }

    public TimeFormat(int hour, int minute, int second) {
        this(hour,minute,second, 24);
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }


    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMaxHour() {
        return maxHour;
    }
    public void setMaxHour(int maxHour) {
        this.maxHour = maxHour;
    }

    public boolean isPositive() {
        return isPositive;
    }
    public void setPositive(boolean isPositive) {
        this.isPositive = isPositive;
    }

    public String toString(){
        String isPos = isPositive()?"":"-";
        return isPos + this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();
    }
}
