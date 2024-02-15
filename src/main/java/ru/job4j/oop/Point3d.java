package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point3d {
    public static double distance(int x1, int y1, int x2, int y2) {

        double result = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        return result;
    }

    public static double distance(int x1, int y1, int z1, int x2, int y2, int z2) {

        double result = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2) + pow((z2 - z1), 2));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(distance(5, 4, 8, 8, 7, 7));
    }
}
