package com.company;

public class StandardRoom extends Room{
    private final double priceCoefficient=1.0;


    public StandardRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient;
    }

    @Override
    public String toString() {
        return "StandardRoom №" + getNumber()+"   ("+ getPrice()+')';
    }
}
