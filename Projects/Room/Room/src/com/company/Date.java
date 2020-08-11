package com.company;

import java.util.Comparator;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day +
                "-" + month +
                "-" + year
                ;
    }

    @Override
    public int compareTo(Date o) {
        int yearComparing = this.year-o.year;
        int monthComparing = this.month-o.month;
        int dayComparing = this.day-o.day;
        if (yearComparing == 0){
            if (monthComparing == 0){
                return dayComparing;
            }
            return monthComparing;
        }
        return yearComparing;
    }

}

