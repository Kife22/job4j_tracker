package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax5To5To8Then8() {
        int first = 5;
        int second = 5;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To5To9To12Then12() {
        int first = 2;
        int second = 5;
        int third = 9;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }
}