package ru.job4j.tracker;
import com.sun.source.tree.IdentifierTree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

      private final LocalDateTime created = LocalDateTime.now();

    public LocalDateTime getCreated() {
        return created;
    }

    public class StaetUI {
        public static void main(String[] args) {
            Item item = new Item();
            LocalDateTime createdDate = item.getCreated();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
            String formattedDate = createdDate.format(formatter);
            System.out.println("Item created on: " + formattedDate);
        }
    }

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