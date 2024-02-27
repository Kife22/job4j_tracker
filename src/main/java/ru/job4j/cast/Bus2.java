package ru.job4j.cast;

public class Bus2 implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дороге");
    }
}
