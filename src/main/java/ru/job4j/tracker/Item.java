package ru.job4j.tracker;
import com.sun.source.tree.IdentifierTree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private final LocalDateTime created = LocalDateTime.now();

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public LocalDateTime getCreated() {
        return created;
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