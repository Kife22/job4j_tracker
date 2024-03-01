package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DummyDicTest {

    @Test
    public void whenEngToRusThenUnknownWord() {
        DummyDic dummyDic = new DummyDic();
        String result = dummyDic.engToRus("apple");
        assertEquals("Неизвестное слово. apple", result);
    }
}