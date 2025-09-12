package com.shimbhu.existing_functional_interfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a+b;

        System.out.println("sum of two number is "+biFunction.apply(77,57));
    }
}
