package com.shimbhu.existing_functional_interfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Integer> randomNumber = () -> (int) Math.random();

        System.out.println(randomNumber.get());

        Supplier<String> girlNames = () -> {
            return "Payal";
        };

        Supplier<String> girlName = () -> "Payal";

        System.out.println("Girl Name is : "+girlNames.get());
        System.out.println("Girl Name is with better impl : "+girlName.get());

    }
}
