package com.shimbhu.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Shimbhu", 77);
        Student student2 = new Student("Payal", 57);

        students.add(student1);
        students.add(student2);

        System.out.println("before sorting : "+students);

        Collections.sort(students,new StudentSorting());

        System.out.println("after roll number sorting : "+students);

    }
}
