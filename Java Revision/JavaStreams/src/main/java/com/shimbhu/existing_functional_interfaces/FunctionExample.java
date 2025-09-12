package com.shimbhu.existing_functional_interfaces;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<Integer, String> function = a -> "number is "+a;

        System.out.println(function.apply(77));
    }
}
