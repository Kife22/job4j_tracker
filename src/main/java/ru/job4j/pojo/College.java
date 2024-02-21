package ru.job4j.pojo;

import java.util.SortedMap;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent("Kirill Gutnik");
        student.setGroup("23-1");
        student.setData("10.12.2023");
        System.out.println(student.getStudent() + " студент группы " + student.getGroup() + " поступил " + student.getData());
    }
}
