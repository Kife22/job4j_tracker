package ru.job4j.cast;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle jet = new Jet();
        Vehicle train = new Train();
        Vehicle bus = new Bus2();

        Vehicle[] vehicles = new Vehicle[]{jet, train, bus};
        for (Vehicle object : vehicles) {
            object.move();
        }
    }
}
