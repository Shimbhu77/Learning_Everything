package com.shimbhu.existing_functional_interfaces.revise;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

    public static void main(String[] args) {

        Consumer<String> consumer = name -> System.out.println("I like the name : "+name);

        consumer.accept("Payal");

        Consumer<Integer> power = a -> System.out.println(Math.pow(a,a));

        List<Integer> list = List.of(1,2,3,4,5,6,7);

        for(int val : list)
        {
            power.accept(val);
        }
    }
}
