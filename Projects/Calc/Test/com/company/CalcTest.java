package com.company;


import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    @Test
    public void plusResultShouldBeSum(){
        Calc calc= new Calc(10,5);
        boolean res= calc.plus()== (calc.getA()+ calc.getB());
        Assert.assertTrue(res);
    }

    @Test
    public void minusResultShouldBeSum(){
        Calc calc= new Calc(10,5);
        boolean res= calc.minus()== (calc.getA() - calc.getB());
        Assert.assertTrue(res);
    }
}
