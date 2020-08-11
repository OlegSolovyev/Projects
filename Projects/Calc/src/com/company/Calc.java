package com.company;

public class Calc {
    private int a;
    private int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus(){
        return a+b;
    }

    public int minus(){
        return a-b;
    }
    public int multiply(){
        return a*b;
    }

    public int divide(){
        return a/b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
