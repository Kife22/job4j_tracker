package ru.job4j.cast;

public class Jet implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит в небе");
    }
}
