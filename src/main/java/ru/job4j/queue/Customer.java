package ru.job4j.queue;

public record Customer(String name, int amount) {

    public String getName() {
        return name;
    }

    @Override
    public int amount() {
        return amount;
    }
}
