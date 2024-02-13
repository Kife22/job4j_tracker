package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import ru.job4j.oop.Point;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when21to24then3() {
        double expected = 3;
        Point a = new Point(2, 1);
        Point b = new Point(2, 4);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenminus12tominus11then1() {
        double expected = 1;
        Point a = new Point(-1, 2);
        Point b = new Point(-1, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when62to11then5Dot09() {
        double expected = 5.09;
        Point a = new Point(6, 2);
        Point b = new Point(1, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}