package ru.job4j.oop;

import ru.job4j.tracker.Item;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        Item itemSecond = new Item();
        LocalDateTime createdDate = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String formattedDate = createdDate.format(formatter);
        System.out.println("Item created on: " + formattedDate);
        System.out.println(itemSecond);
    }
}