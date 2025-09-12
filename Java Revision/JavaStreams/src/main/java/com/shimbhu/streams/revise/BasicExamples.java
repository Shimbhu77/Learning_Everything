package com.shimbhu.streams.revise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicExamples {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(40);
        nums.add(70);
        nums.add(77);
        nums.add(57);

        // filter method
        List<Integer> collected = nums.stream().filter(a -> a > 50).collect(Collectors.toList());
        System.out.println(collected);

        List<Integer> collectedList = nums.stream()
                .filter(a -> a > 50)
                .filter(a -> a > 70 || a < 60)
                .collect(Collectors.toList());

        System.out.println(collected);
        System.out.println(collectedList);

        // map method

        List<Integer> doubleNums = nums.stream().map((num) -> num * 7).collect(Collectors.toList());
        System.out.println(doubleNums);

        doubleNums.forEach(num -> System.out.println(num));

    }
}
