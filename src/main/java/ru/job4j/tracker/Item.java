package ru.job4j.tracker;
import com.sun.source.tree.IdentifierTree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private final LocalDateTime created = LocalDateTime.now();

    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}