package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    @Override
    public void passengers(int numbersOfPassenger) {
        System.out.println("Number of passenger " + numbersOfPassenger);
    }

    @Override
    public double refuel(int fuelAmount) {
        System.out.println("Refueling bus with " + fuelAmount + " liters of fuel");
        return fuelAmount;
    }
}
