package com.shimbhu.streams;

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

        List<Integer> collect = nums.stream().filter(num -> num > 50).collect(Collectors.toList());
        System.out.println(collect);

        // map method

        List<Integer> mapList = nums.stream().map(num -> num * 7).collect(Collectors.toList());
        System.out.println(mapList);


    }
}
