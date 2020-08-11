package com.company;

public class SuiteRoom extends Room{
    private final double priceCoefficient=1.3;

    public SuiteRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient;
    }

    @Override
    public String toString() {
        return "SuiteRoom №" + getNumber()+"   ("+ getPrice()+')';
    }
}
