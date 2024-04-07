package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("kife22@mail.ru", "Kirill Gutnik");
        map.put("summerset216@mail.ru", "Artem Patek");
        map.put("kife22@mail.ru", "Kirill Gutnik");
        for (String maps : map.keySet()) {
            String value = map.get(maps);
            System.out.println(maps + " = " + value);
        }
    }
}
