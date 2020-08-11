package com.company;

import java.util.Random;

public class DateInterval {
    private Date start;
    private Date finish;
    private Random rnd = new Random(System.currentTimeMillis());
    private int days;

    public DateInterval(Date start, Date finish) {
        if (start.compareTo(finish)>0){
            this.start=finish;
            this.finish=start;
        }else {
            this.start = start;
            this.finish = finish;
        }
        }

    public static boolean checksTwoDateIntervalsForIntersection(DateInterval first, DateInterval second){
        if (first.getStart().compareTo(second.getStart())>0){  // если первый интервал начинается позже чем второй
            if (first.getStart().compareTo(second.getFinish())>=0){ // и если первый начинается позже чем заканчивается второй
                return false; // то они не пересекаются
            }
            return true;  // если же второй начинается раньше чем заканчивается первый, то они пересекаются
        } else { // если первый интервал начинается раньше или одновременно со вторым
            if (first.getFinish().compareTo(second.getStart())>0){  // то если первый заканчивается позже чем начинается второй
                return true;  // то они пересекаются
            }
            return false; // если же первый заканчивается раньше чем начинается второй, то они не пересекаются
        }
    }

    public static boolean isIntersect(DateInterval dateInterval1, DateInterval dateInterval2) {
        return !((dateInterval1.getStart().compareTo(dateInterval2.getFinish())>0)||
        (dateInterval2.getStart().compareTo(dateInterval1.getFinish())>0));
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }

    public int getDays(){
        days=0;
        if (start.getYear()!=finish.getYear()){
            int counter=0;
            int[] years= new int[finish.getYear()-start.getYear()];
            for (int j=0; j<years.length;j++){
                years[j]=start.getYear()+1+j;
            }
            for (int i=0; i<years.length; i++){
                if (years[i]%400==0||((years[i]%100!=0)&&(years[i]%4==0))){
                    counter++;
                }
            }
            days+=years.length*365+counter;
        }
        int minusDays=0;
        for (int i=1;i<=start.getMonth();i++){
            if((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12)) {
                minusDays+= 31;
            } else {
                if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {
                    minusDays += 30;
                } else {
                    if (i==2){
                        minusDays+=(start.getYear()%400==0||((start.getYear()%100!=0)&&(start.getYear()%4==0)))? 29: 28;
                    } else {
                        return -1;
                    }
                }
            }
        }
        int addDays=0;
        for (int i=1;i<=finish.getMonth();i++){
            if((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12)) {
                addDays+= 31;
            } else {
                if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {
                    addDays += 30;
                } else {
                    if (i==2){
                        addDays+=(start.getYear()%400==0||((start.getYear()%100!=0)&&(start.getYear()%4==0)))? 29: 28;
                    } else {
                        return -1;
                    }
                }
            }
        }
        days=days-minusDays-start.getDay()+addDays+finish.getDay();
        return days;
    }

    @Override
    public String toString() {
        return "[" + start +
                ';' + finish +
                ']';
    }
}
