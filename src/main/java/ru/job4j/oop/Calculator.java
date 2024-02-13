package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return d - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + multiply(c) + minus(c) + divide(c);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = sum(10);
        System.out.println(result);
        int result1 = multiply(5);
        System.out.println(result1);
        int result2 = minus(12);
        System.out.println(result2);
        int result3 = calc.divide(16);
        System.out.println(result3);
        int result4 = calc.sumAllOperation(20);
        System.out.println(result4);
    }
}