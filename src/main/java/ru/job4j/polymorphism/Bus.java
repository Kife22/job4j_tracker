package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {

    }

    @Override
    public void passengers(int numbersOfPassenger) {

    }

    @Override
    public double refuel(int fuelAmount) {
        return fuelAmount;
    }
}
