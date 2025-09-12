package com.shimbhu.existing_functional_interfaces;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<Integer> consumer = a -> System.out.println(a);

        consumer.accept(77);
    }
}
