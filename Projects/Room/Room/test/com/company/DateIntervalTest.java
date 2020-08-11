package com.company;

import org.junit.Assert;
import org.junit.Test;

public class DateIntervalTest {

    @Test
    public void dateFinishShouldBeAfterStart(){
        Date d1= new Date(30,8,2020);
        Date d2= new Date(10,8,2020);
        DateInterval dateInterval= new DateInterval(d1,d2);
        boolean res= dateInterval.getStart().equals(d2) && dateInterval.getFinish().equals(d1);
        Assert.assertTrue(res);
    }

    @Test
    public void dateFinishShouldBeAfterStart2(){
        Date d2= new Date(30,8,2020);
        Date d1= new Date(10,8,2020);
        DateInterval dateInterval= new DateInterval(d1,d2);
        boolean res= dateInterval.getStart().equals(d1) && dateInterval.getFinish().equals(d2);
        Assert.assertTrue(res);
    }

    @Test
    public void isIntersectTest(){
        Date d11= new Date(10,8,2020);
        Date d12= new Date(30,8,2020);
        DateInterval dateInterval1= new DateInterval(d11,d12);

        Date d21= new Date(15,8,2020);
        Date d22= new Date(15,9,2020);
        DateInterval dateInterval2= new DateInterval(d21,d22);

        Assert.assertTrue(DateInterval.isIntersect(dateInterval1,dateInterval2));
    }

    @Test
    public void isIntersectFalseTest(){
        Date d11= new Date(10,8,2020);
        Date d12= new Date(30,8,2020);
        DateInterval dateInterval1= new DateInterval(d11,d12);

        Date d21= new Date(15,9,2020);
        Date d22= new Date(20,9,2020);
        DateInterval dateInterval2= new DateInterval(d21,d22);

        Assert.assertFalse(DateInterval.isIntersect(dateInterval1,dateInterval2));
    }
}
