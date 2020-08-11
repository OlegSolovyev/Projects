package com.company;

public class DeLuxeRoom extends Room{
    private final double priceCoefficient=1.5;
    private final double deLuxeTax=50.0;


    public DeLuxeRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient;
    }

    @Override
    public String toString() {
        return "DeLuxeRoom №" + getNumber()+"   ("+ getPrice()+')';
    }
}
