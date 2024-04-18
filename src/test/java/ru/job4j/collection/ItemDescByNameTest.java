package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemDescByNameTest {

    @Test
    public void testSortDescendingByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("A", 3));
        items.add(new Item("B", 1));
        items.add(new Item("C", 2));
        List<Item> expected = new ArrayList<>(items);
        Collections.sort(expected, new ItemDescByName());
        Collections.sort(items, new ItemDescByName()); // Сортировка по убыванию имени
        assertEquals(expected, items);
    }

}