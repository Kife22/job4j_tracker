package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class Point3dTest {

    @Test
    void whenminus12tominus11then1() {
        double expected = 1;
        int x1 = -1;
        int y1 = 2;
        int x2 = -1;
        int y2 = 1;
        double output = Point3d.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when62to11then5Dot09() {
        double expected = 5.09;
        int x1 = 6;
        int y1 = 2;
        int x2 = 1;
        int y2 = 1;
        double output = Point3d.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when548to877then4Dot35() {
        double expected = 4.35;
        int x1 = 5;
        int y1 = 4;
        int z1 = 8;
        int x2 = 8;
        int y2 = 7;
        int z2 = 7;
        double output = Point3d.distance(x1, y1, z1, x2, y2, z2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}