package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String origin2 : origin) {
            check.add(origin2);
        }
        for (String origin2 : text) {
            if (!check.contains(origin2)) {
                result = false;
                break;
            }
        }
        return result;
    }
}