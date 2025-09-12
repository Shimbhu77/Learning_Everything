package com.shimbhu.existing_functional_interfaces.revise;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {

        List<Integer> list = List.of(34, 56, 77, 87, 98, 94, 90);
        Predicate<Integer> passMarks = a -> a > 60;

        for (int val : list) {
            System.out.println("First Division : " + passMarks.test(val));
        }

        String fullName = "Payal";

        Predicate<String> is = name -> name.equals("Payal");

        System.out.println(is.test(fullName));

    }
}
