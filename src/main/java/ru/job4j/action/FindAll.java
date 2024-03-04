package ru.job4j.action;

import ru.job4j.tracker.*;

public class FindAll implements UserAction {
    private final Output output;

    public FindAll(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать все заявки";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
                System.out.println(output);
        } else {
            output.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
