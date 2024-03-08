package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return i;

            }
        }
        throw new  ElementNotFoundException("Element not found");

    }

    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4"};
        String key1 = "5";
        try {
            indexOf(array, key1);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}